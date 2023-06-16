package com.projetopessoal.projetopessoal.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Endereco")
@Data
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String cep;
}