package com.projetopessoal.projetopessoal.service;

import com.projetopessoal.projetopessoal.models.Endereco;
import com.projetopessoal.projetopessoal.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco salvarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco buscarEnderecoPorId(Integer id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    public List<Endereco> buscarTodosEnderecos() {
        return enderecoRepository.findAll();
    }

    public void deletarEndereco(Integer id) {
        enderecoRepository.deleteById(id);
    }
}
