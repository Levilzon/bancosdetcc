package br.bancas.bancasdetcc.repositorio;

import br.bancas.bancasdetcc.entidade.Aluno;
import br.bancas.bancasdetcc.entidade.AlunoPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno, AlunoPK> {
}
