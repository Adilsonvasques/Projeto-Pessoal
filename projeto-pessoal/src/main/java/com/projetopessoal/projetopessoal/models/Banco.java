package com.projetopessoal.projetopessoal.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Banco")
@Data
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;
}
