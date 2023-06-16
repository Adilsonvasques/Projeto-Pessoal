package com.projetopessoal.projetopessoal.service;

import com.projetopessoal.projetopessoal.models.Pessoa;
import com.projetopessoal.projetopessoal.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa buscarPessoaPorId(Integer id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public List<Pessoa> buscarTodasPessoas() {
        return pessoaRepository.findAll();
    }

    public void deletarPessoa(Integer id) {
        pessoaRepository.deleteById(id);
    }
}