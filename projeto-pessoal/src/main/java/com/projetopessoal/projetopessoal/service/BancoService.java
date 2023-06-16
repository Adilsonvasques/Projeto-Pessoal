package com.projetopessoal.projetopessoal.service;

import com.projetopessoal.projetopessoal.models.Banco;
import com.projetopessoal.projetopessoal.repository.BancoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoService {

    private final BancoRepository bancoRepository;

    public BancoService(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    public Banco salvarBanco(Banco banco) {
        return bancoRepository.save(banco);
    }

    public Banco buscarBancoPorId(Integer id) {
        return bancoRepository.findById(id).orElse(null);
    }

    public List<Banco> buscarTodosBancos() {
        return bancoRepository.findAll();
    }

    public void deletarBanco(Integer id) {
        bancoRepository.deleteById(id);
    }
}