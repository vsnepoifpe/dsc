package br.edu.ifpe.dsc.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/")
    public String hellooWorld() {
        return "Hello World!!";
    }

}
