package br.com.calculadora.projetocalculadora.exceptions;

public class NumeroInvalidoException extends RuntimeException {

    public NumeroInvalidoException(String mensagem) {
        super(mensagem);
    }
}