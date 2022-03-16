package com.example.demo.cadastro.Dao;

import com.example.demo.cadastro.Model.CadastroModel;
import com.example.demo.cadastro.Model.Especialidade;

import java.util.List;
import java.util.Optional;

public interface CadastroDao {

    CadastroModel save (CadastroModel cadastroModel);
    CadastroModel update (CadastroModel cadastroModel);
    void delete(Long id);
    List<CadastroModel> findAll();
    List<CadastroModel> findByEspecialidade(Especialidade especialidade);
    Optional<CadastroModel> findById(Long id);
    Optional<CadastroModel> findByCrm(String crm);
    Optional<CadastroModel> findByNome(String nome);
    Optional<CadastroModel> findByLocalidade(String localidade);

}
