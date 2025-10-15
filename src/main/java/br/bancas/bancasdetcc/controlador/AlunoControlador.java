package br.bancas.bancasdetcc.controlador;

import br.bancas.bancasdetcc.DTO.AlunoDTO;
import br.bancas.bancasdetcc.entidade.Aluno;
import br.bancas.bancasdetcc.servicos.AlunoServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public List<AlunoDTO> perfilMinAluno(){
        List<AlunoDTO> result =alunoServicos.pesquisarInfoMinAlunos();
        return result;
    }
    @GetMapping("/infocompletoaluno")
    public ResponseEntity<List<Aluno>> pesquisarTodos(){
       List<Aluno> result = alunoServicos.pesquisarTodosAlunos();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/pesquisaraluno/{id}")
    public ResponseEntity<Optional<Aluno>> pesquisaEspecifica(@PathVariable Long id){
        Optional<Aluno> result = alunoServicos.pesquisarPorId(id);
        return ResponseEntity.ok(result);
    }
    @PostMapping("/cadastro")
    public ResponseEntity<Aluno> registrarAluno(@RequestBody Aluno aluno){
        Aluno result = alunoServicos.salvar(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
    @PutMapping("/editarperfil/{id}")
    public ResponseEntity<Aluno> alterarDados(@PathVariable Long id, @RequestBody Aluno aluno){
        aluno.setId(id);
        Aluno atualizar = alunoServicos.salvar(aluno);
        return ResponseEntity.ok(atualizar);
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarAluno(@PathVariable Long id){
        alunoServicos.deletarPorId(id);
        return ResponseEntity.ok(id);
    }
}

