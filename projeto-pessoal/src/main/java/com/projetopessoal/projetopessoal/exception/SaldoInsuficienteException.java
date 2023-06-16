package com.projetopessoal.projetopessoal.exception;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
