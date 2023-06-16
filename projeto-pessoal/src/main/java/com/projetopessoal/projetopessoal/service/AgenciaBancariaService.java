package com.projetopessoal.projetopessoal.service;

import com.projetopessoal.projetopessoal.models.AgenciaBancaria;
import com.projetopessoal.projetopessoal.repository.AgenciaBancariaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenciaBancariaService {

    private final AgenciaBancariaRepository agenciaBancariaRepository;

    public AgenciaBancariaService(AgenciaBancariaRepository agenciaBancariaRepository) {
        this.agenciaBancariaRepository = agenciaBancariaRepository;
    }

    public AgenciaBancaria salvarAgenciaBancaria(AgenciaBancaria agenciaBancaria) {
        return agenciaBancariaRepository.save(agenciaBancaria);
    }

    public AgenciaBancaria buscarAgenciaBancariaPorId(Integer id) {
        return agenciaBancariaRepository.findById(id).orElse(null);
    }

    public List<AgenciaBancaria> buscarTodasAgenciasBancarias() {
        return agenciaBancariaRepository.findAll();
    }

    public void deletarAgenciaBancaria(Integer id) {
        agenciaBancariaRepository.deleteById(id);
    }
}
