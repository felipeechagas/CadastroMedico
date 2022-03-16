package com.example.demo.cadastro.Model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "cadastro")
public class CadastroModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 6)
    private String crm;

    @Column(nullable = false, length = 20)
    private String especialidade1;

    @Column(nullable = false, length = 20)
    private String especialidade2;

    @Column(nullable = false, length = 11)
    private String telFixo;

    @Column(nullable = false, length = 11)
    private String telCelular;

    @Column(nullable = false, length = 9)
    private String cep;

    @Column(nullable = false, length = 50)
    private String logradouro;

    @Column(nullable = false, length = 50)
    private String complemento;

    @Column(nullable = false, length = 50)
    private String bairro;

    @Column(nullable = false, length = 50)
    private String localidade;

    @Column(nullable = false, length = 10)
    private String uf;

}
