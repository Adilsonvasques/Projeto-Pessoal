package com.projetopessoal.projetopessoal.repository;

import com.projetopessoal.projetopessoal.models.AgenciaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenciaBancariaRepository extends JpaRepository<AgenciaBancaria, Integer> {
}
