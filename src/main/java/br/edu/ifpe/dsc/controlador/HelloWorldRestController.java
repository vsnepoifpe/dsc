package br.edu.ifpe.dsc.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldRestController {

    @GetMapping
    public String hellooWorld() {
        return "Hello World!!";
    }

    @GetMapping("/param")
    public String hellooWorldParam(@RequestParam("nome") String nome, @RequestParam("sobrenome") String sobrenome, 
        @RequestParam("valor") String valor) {
            
        return "Hello World, " + nome + " " + sobrenome+ "!!";
    }

    @GetMapping("/path/{nome}/{sobrenome}")
    public String hellooWorldPath(@PathVariable String nome, @PathVariable String sobrenome) {
        return "Hello World, " + nome + " " + sobrenome+ "!!";
    }

    @GetMapping("/path/{nome}/{sobrenome}/{valor}")
    public String hellooWorldPath2(@PathVariable String nome, @PathVariable String sobrenome, @PathVariable String valor) {
        return "Hello World, " + nome + " " + sobrenome+ "!!" + " - Valor: " + valor;
    }

}
