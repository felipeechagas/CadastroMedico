package com.example.demo.cadastro.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadastroDto {

    @NotBlank
    private String nome;

    @NotBlank
    private String crm;

    @NotBlank
    private String especialidade1;

    @NotBlank
    private String especialidade2;

    @NotBlank
    private String telFixo;

    @NotBlank
    private String telCelular;

    @NotBlank
    private String cep;

    @NotBlank
    private String logradouro;

    private String complemento;

    @NotBlank
    private String bairro;

    @NotBlank
    private String localidade;

    @NotBlank
    private String uf;

}
