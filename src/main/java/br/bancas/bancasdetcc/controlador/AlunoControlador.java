package br.bancas.bancasdetcc.controlador;

import br.bancas.bancasdetcc.entidade.Aluno;
import br.bancas.bancasdetcc.servicos.AlunoServicos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class AlunoControlador {
    //teste
    private AlunoServicos alunoServicos;

    @GetMapping("/hello")
    public String hello() {
        return "Tem pão?";
    }

    public List<Aluno> findAll(){
        List<Aluno> result = alunoServicos.findAll();
        return result;
        }
}

