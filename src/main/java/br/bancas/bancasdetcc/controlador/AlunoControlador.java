package br.bancas.bancasdetcc.controlador;

import br.bancas.bancasdetcc.DTO.AlunoDTO;
import br.bancas.bancasdetcc.entidade.Aluno;
import br.bancas.bancasdetcc.servicos.AlunoServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class AlunoControlador {
    //teste
    @Autowired
    private AlunoServicos alunoServicos;

    @GetMapping("/hello")
    public String hello() {
        return "Tem pão?";
    }
    @GetMapping("/infoaluno")
    public List<AlunoDTO> findAll(){
        List<AlunoDTO> result =alunoServicos.findInfoAluno();
        return result;
    }
    @GetMapping("/infocompletoaluno")
    public List<Aluno>findAllAluno(){
        List<Aluno> result = alunoServicos.findAllAluno();
        return result;
    }
}

