package com.projetopessoal.projetopessoal.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Telefone")
@Data
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String tipo;
}
