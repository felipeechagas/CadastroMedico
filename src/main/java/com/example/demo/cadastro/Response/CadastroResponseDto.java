package com.example.demo.cadastro.Response;

import com.example.demo.cadastro.Dto.CadastroDto;
import com.example.demo.cadastro.Model.CadastroModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CadastroResponseDto {

    private String nome;
    private String crm;
    private String especialidade1;
    private String especialidade2;
    private String telFixo;
    private String telCelular;

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public static CadastroResponseDto converter(CadastroModel c){
        var cadastro = new CadastroResponseDto();
        cadastro.setCrm(c.getCrm());
        return cadastro;
    }

    public CadastroResponseDto(CadastroModel crm){

        this.nome = crm.getNome();
        this.crm = crm.getCrm();
        this.especialidade1 = crm.getEspecialidade1();
        this.especialidade2 = crm.getEspecialidade2();
        this.telFixo = crm.getTelFixo();
        this.telCelular = crm.getTelCelular();

        this.cep = crm.getCep();
        this.logradouro = crm.getLogradouro();
        this.complemento = crm.getComplemento();
        this.bairro = crm.getBairro();
        this.localidade = crm.getLocalidade();
        this.uf = crm.getUf();
    }
}
