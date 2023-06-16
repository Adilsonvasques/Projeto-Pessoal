package com.projetopessoal.projetopessoal.repository;

import com.projetopessoal.projetopessoal.models.Banco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Integer> {
}
