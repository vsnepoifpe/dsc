package br.edu.ifpe.dsc.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpe.dsc.model.Calculadora;
import br.edu.ifpe.dsc.model.dto.ResultadoDTO;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
    
    @Autowired
    private Calculadora calculadora;

    @GetMapping("/soma/{a}/{b}")
    public ResultadoDTO calculateSoma(@PathVariable Integer a, @PathVariable Integer b) {
        ResultadoDTO resultado = new ResultadoDTO();
        resultado.setOperacao("Soma");
        resultado.setResultado(this.calculadora.somar(a, b));
        return resultado;

    }

}
