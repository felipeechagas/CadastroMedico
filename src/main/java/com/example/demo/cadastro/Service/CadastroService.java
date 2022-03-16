package com.example.demo.cadastro.Service;

import com.example.demo.cadastro.Model.CadastroModel;
import com.example.demo.cadastro.Repository.CadastroRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CadastroService {

    //Ponto de injeção
    final CadastroRepository cadastroRepository;


    //Construtor
    public CadastroService(CadastroRepository cadastroRepository){
        this.cadastroRepository = cadastroRepository;
    }

    //Salvar
    @Transactional
    public CadastroModel save(CadastroModel cadastroModel) {
        return cadastroRepository.save(cadastroModel);
    }

    //Buscar Todos
    public List<CadastroModel> findAll() {
        return cadastroRepository.findAll();
    }

    //Buscar Por ID
    public Optional<CadastroModel> findById(Long id) {
        Optional<CadastroModel> Objeto = cadastroRepository.findById(id);
        return Objeto;
    }

    //Atualizar
    public CadastroModel update (CadastroModel cadastroModel, Long id){
        cadastroModel.setId(id);
        return cadastroRepository.save(cadastroModel);
    }

    //Deletar
    @Transactional
    public void delete(CadastroModel cadastroModel) {
        cadastroRepository.delete(cadastroModel);
    }

    //Buscar personalizada Cep. Fazer no repository.
    public Optional<CadastroModel> getByCep(String cep) {
        return cadastroRepository.getByCep(cep);
    }

}
