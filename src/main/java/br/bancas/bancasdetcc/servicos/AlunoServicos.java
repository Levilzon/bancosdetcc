package br.bancas.bancasdetcc.servicos;

import br.bancas.bancasdetcc.entidade.Aluno;
import br.bancas.bancasdetcc.entidade.AlunoPK;
import br.bancas.bancasdetcc.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServicos {
    @Autowired
    private AlunoRepositorio alunoRepositorio;

    public List<Aluno> findAll(){
        List<Aluno> result = alunoRepositorio.findAll();
        return result;
    }
}
