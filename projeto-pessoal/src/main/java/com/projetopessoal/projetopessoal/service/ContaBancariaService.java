package com.projetopessoal.projetopessoal.service;

import com.projetopessoal.projetopessoal.exception.ContaInativaException;
import com.projetopessoal.projetopessoal.exception.ContaNaoEncontradaException;
import com.projetopessoal.projetopessoal.exception.SaldoInsuficienteException;
import com.projetopessoal.projetopessoal.models.ContaBancaria;
import com.projetopessoal.projetopessoal.repository.ContaBancariaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaBancariaService {

    private final ContaBancariaRepository contaBancariaRepository;

    public ContaBancariaService(ContaBancariaRepository contaBancariaRepository) {
        this.contaBancariaRepository = contaBancariaRepository;
    }

    public ContaBancaria salvarContaBancaria(ContaBancaria contaBancaria) {
        return contaBancariaRepository.save(contaBancaria);
    }

    public ContaBancaria buscarContaBancariaPorId(Integer id) {
        return contaBancariaRepository.findById(id).orElse(null);
    }

    public List<ContaBancaria> buscarTodasContasBancarias() {
        return contaBancariaRepository.findAll();
    }

    public void deletarContaBancaria(Integer id) {
        contaBancariaRepository.deleteById(id);
    }

    public void realizarTransacao(Integer contaOrigemId, Integer contaDestinoId, double valor) {
        ContaBancaria contaOrigem = contaBancariaRepository.findById(contaOrigemId)
                .orElseThrow(() -> new ContaNaoEncontradaException("Conta de origem não encontrada"));

        ContaBancaria contaDestino = contaBancariaRepository.findById(contaDestinoId)
                .orElseThrow(() -> new ContaInativaException("Conta de destino não encontrada"));

        if (contaOrigem.getSaldo() < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente na conta de origem");
        }

        //Atualizar o saldo das contas
        contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);

        //Salvar as contas atualizadas
        contaBancariaRepository.save(contaOrigem);
        contaBancariaRepository.save(contaDestino);
    }
}