package br.com.calculadora.projetocalculadora.services;

import org.springframework.stereotype.Service;
import br.com.calculadora.projetocalculadora.exceptions.NumeroInvalidoException;

@Service
public class CalculadoraService {

    public Double somar(String n1, String n2) {
        if(eNumero(n1) && eNumero(n2)) {
            return Double.parseDouble(n1) + Double.parseDouble(n2);
        }
        throw new NumeroInvalidoException("Um ou ambos os valores não são numéricos");
    }

    public Double subtrair(String n1, String n2) {
        if(eNumero(n1) && eNumero(n2)) {
            return Double.parseDouble(n1) - Double.parseDouble(n2);
        }
        throw new NumeroInvalidoException("Um ou ambos os valores não são numéricos");
    }

    public Double dividir(String n1, String n2) {
        if(eNumero(n1) && eNumero(n2)) {
            if(n2.equals("0")) {
                throw new ArithmeticException("O divisor não pode ser zero");
            }
            return Double.parseDouble(n1) / Double.parseDouble(n2);
        }
        throw new NumeroInvalidoException("Um ou ambos os valores não são numéricos");
    }

    public Double multiplicar(String n1, String n2) {
        if(eNumero(n1) && eNumero(n2)) {
            return Double.parseDouble(n1) * Double.parseDouble(n2);
        }
        throw new NumeroInvalidoException("Um ou ambos os valores não são numéricos");
    }

    public Double potencia(Double base, Double expoente) {
        return Math.pow(base, expoente);
    }

    private Boolean eNumero(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch(Exception ex) {
            return false;
        }
    }
}
