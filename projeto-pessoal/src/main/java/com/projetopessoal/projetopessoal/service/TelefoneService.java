package com.projetopessoal.projetopessoal.service;

import com.projetopessoal.projetopessoal.models.Telefone;
import com.projetopessoal.projetopessoal.repository.TelefoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneService {

    private final TelefoneRepository telefoneRepository;

    public TelefoneService(TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
    }

    public Telefone salvarTelefone(Telefone telefone) {
        return telefoneRepository.save(telefone);
    }

    public Telefone buscarTelefonePorId(Integer id) {
        return telefoneRepository.findById(id).orElse(null);
    }

    public List<Telefone> buscarTodosTelefones() {
        return telefoneRepository.findAll();
    }

    public void deletarTelefone(Integer id) {
        telefoneRepository.deleteById(id);
    }
}