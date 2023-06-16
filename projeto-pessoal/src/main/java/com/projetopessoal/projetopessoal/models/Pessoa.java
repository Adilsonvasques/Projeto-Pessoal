package com.projetopessoal.projetopessoal.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Pessoa")
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "telefone_id", nullable = false)
    private Telefone telefone;

    @ManyToOne
    @JoinColumn(name = "banco_id", nullable = false)
    private Banco banco;
}