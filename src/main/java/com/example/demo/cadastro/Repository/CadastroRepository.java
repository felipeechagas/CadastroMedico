package com.example.demo.cadastro.Repository;

import com.example.demo.cadastro.Model.CadastroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroModel, Long> {

    //metodo de busca personalizada
    List<CadastroModel>findByCrm(String crm);

    Optional<CadastroModel> findById(long id);

    //metodo de busca personalizada
    Optional<CadastroModel> getByCep(String cep);

    //metodo de busca personalizada
    List<CadastroModel> findByCrmContains (String crm);


}
