package br.bancas.bancasdetcc.servicos;

import br.bancas.bancasdetcc.Componente.AlunoComponente;
import br.bancas.bancasdetcc.DTO.AlunoDTO;
import br.bancas.bancasdetcc.entidade.Aluno;
import br.bancas.bancasdetcc.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoServicos {
    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @Autowired
    private AlunoComponente alunoComponente;

    public List<AlunoDTO>pesquisarInfoMinAlunos(){
        List<Aluno> result = alunoRepositorio.findAll();
        List<AlunoDTO> dto = result.stream().map(x -> new AlunoDTO(x)).toList();
        return dto;
    }
    public List<Aluno>pesquisarTodosAlunos(){
        List<Aluno> result = alunoRepositorio.findAll();
        return result;
    }
    public Optional<Aluno> pesquisarPorId(Long id){
        Optional<Aluno> result = alunoRepositorio.findById(id);
        return result;
    }
    public Aluno salvar(Aluno aluno){
        return alunoRepositorio.save(aluno);
    }
    public void deletarPorId(@PathVariable Long id){
        alunoRepositorio.deleteById(id);
    }

}
