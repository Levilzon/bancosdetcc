package br.bancas.bancasdetcc.servicos;

import br.bancas.bancasdetcc.DTO.AlunoDTO;
import br.bancas.bancasdetcc.entidade.Aluno;
import br.bancas.bancasdetcc.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AlunoServicos {
    @Autowired
    private AlunoRepositorio alunoRepositorio;

    public List<AlunoDTO>findInfoAluno(){
        List<Aluno> result =alunoRepositorio.findAll();
        List<AlunoDTO> dto = result.stream().map(x -> new AlunoDTO(x)).toList();
        return dto;
    }
    public List<Aluno>findAllAluno(){
        List<Aluno> result = alunoRepositorio.findAll();
        return result;
    }
    public Aluno save(Aluno aluno){
        return alunoRepositorio.save(aluno);
    }
    public void deletarPorId(@PathVariable Long id){
        alunoRepositorio.deleteById(id);
    }

}
