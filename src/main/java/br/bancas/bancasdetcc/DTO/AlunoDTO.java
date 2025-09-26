package br.bancas.bancasdetcc.DTO;

import br.bancas.bancasdetcc.entidade.Aluno;
import br.bancas.bancasdetcc.projection.AlunoProjection;

public class AlunoDTO {
    private Long id;
    private String nome;
    private String universidade;
    private String curso;
    private String tema;

    public AlunoDTO(Aluno entity){
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.universidade = entity.getUniversidade();
        this.curso = entity.getCurso();
        this.tema = entity.getTema();
    }

    public AlunoDTO(AlunoProjection projection){
        this.id = projection.getId();
        this.nome = projection.getNome();
        this.universidade = projection.getUniversidade();
        this.curso = projection.getCurso();
        this.tema = projection.getTema();
    }

    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getUniversidade(){
        return universidade;
    }

    public String getCurso(){
        return curso;
    }

    public String getTema(){
        return tema;
    }

}
