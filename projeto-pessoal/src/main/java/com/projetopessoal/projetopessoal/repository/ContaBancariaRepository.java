package com.projetopessoal.projetopessoal.repository;

import com.projetopessoal.projetopessoal.models.ContaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Integer> {

}
