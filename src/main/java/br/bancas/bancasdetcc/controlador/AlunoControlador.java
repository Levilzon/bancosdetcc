package br.bancas.bancasdetcc.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class AlunoControlador {
    //teste
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

