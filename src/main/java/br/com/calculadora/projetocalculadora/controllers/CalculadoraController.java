package br.com.calculadora.projetocalculadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.calculadora.projetocalculadora.services.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
@CrossOrigin("*")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/somar/{n1}/{n2}")
    public Double somar(@PathVariable String n1, @PathVariable String n2) {
        return calculadoraService.somar(n1, n2);
    }

    @GetMapping("/subtrair/{n1}/{n2}")
    public Double subtrair(@PathVariable String n1, @PathVariable String n2) {
        return calculadoraService.subtrair(n1, n2);
    }

    @GetMapping("/dividir/{n1}/{n2}")
    public Double dividir(@PathVariable String n1, @PathVariable String n2) {
        return calculadoraService.dividir(n1, n2);
    }

    @GetMapping("/multiplicar/{n1}/{n2}")
    public Double multiplicar(@PathVariable String n1, @PathVariable String n2) {
        return calculadoraService.multiplicar(n1, n2);
    }

    @GetMapping("/potencia/{base}/{expoente}")
    public Double potencia(@PathVariable String base, @PathVariable String expoente) {
        // Converter base e expoente para double, pois podem ser números com casas decimais
        Double baseDouble = Double.parseDouble(base);
        Double expoenteDouble = Double.parseDouble(expoente);
        
        // Realizar o cálculo de potência
        return Math.pow(baseDouble, expoenteDouble);
    }
}