package com.example.demo.cadastro.Controller;

import com.example.demo.cadastro.Dto.CadastroDto;
import com.example.demo.cadastro.Model.CadastroModel;
import com.example.demo.cadastro.Response.CadastroResponseDto;
import com.example.demo.cadastro.Service.CadastroService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//@Api(value = "Api REST Cadastros")
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CadastroController {

    //Ponto de injeção do service no controller
    final CadastroService cadastroService;

    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

   // @ApiOperation("Retorna todos os cadastrados")
    @GetMapping("/cadastro")
    public ResponseEntity<List<CadastroModel>> getAllCadastrados() {
        return ResponseEntity.status(HttpStatus.OK).body(cadastroService.findAll());
    }

    // @ApiOperation("Retorna todos os cadastrados")
    @GetMapping("/cadastro/{cep}")
    public ResponseEntity<Object>getOneCep(@PathVariable String cep){
        Optional<CadastroModel> cepObject = cadastroService.getByCep(cep);
        if (cepObject.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(cepObject.get());
        } else {
            String url = "https://viacep.com.br/ws/"+ cep +"/json/";
            RestTemplate restTemplate = new RestTemplate();
            CadastroModel enderecoResponse = restTemplate.getForObject(url, CadastroModel.class);
            return new ResponseEntity<>(new CadastroResponseDto(enderecoResponse), HttpStatus.OK);
        }
    }

    // @ApiOperation("Salvar novo cadastrado")
    @PostMapping("/cadastro")
    public ResponseEntity<Object> saveCadastro(@RequestBody @Valid CadastroDto cadastroDto) {
        var cadastroModel = new CadastroModel();
        BeanUtils.copyProperties(cadastroDto, cadastroModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastroService.save(cadastroModel));
    }

    // @ApiOperation("Atualizar cadastrado")
    @PutMapping("/cadastro/{id}")
    public ResponseEntity<Object> updateCadastro(@PathVariable(value = "id") Long id,
                                               @RequestBody @Valid CadastroDto cadastroDto) {
        Optional<CadastroModel> cadastroModelOptional = cadastroService.findById(id);
        if (!cadastroModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cadastro Não Encontrado.");
        } else {
            //Mantem o id mesmo id sem alteração
            var cadastroModel = new CadastroModel();
            BeanUtils.copyProperties(cadastroDto, cadastroModel);
            cadastroModel.setId(cadastroModelOptional.get().getId());
            return ResponseEntity.status(HttpStatus.OK).body(cadastroService.save(cadastroModel));
        }
    }

    // @ApiOperation("Deletar cadastrado")
    @DeleteMapping("cadastro/{id}")
    public ResponseEntity<Object> deleteCadastro (@PathVariable(value = "id") Long id){
        Optional<CadastroModel> cadastroModelOptional = cadastroService.findById(id);
        if (!cadastroModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cadastro Não Encontrado.");
        } else {
            cadastroService.delete(cadastroModelOptional.get());
            return ResponseEntity.status(HttpStatus.OK).body("Cadastro delete successfully");
        }
    }
}
