package br.bancas.bancasdetcc.repositorio;

import br.bancas.bancasdetcc.entidade.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {
}
