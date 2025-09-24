package br.bancas.bancasdetcc.entidade;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_aluno")
public class Aluno{
    @EmbeddedId
    private AlunoPK id;

    private String nome;
    private String curso;
    private int semestre;

    public Aluno(){

    }
    public Aluno(AlunoPK id, String nome, String curso, int semestre){
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
    }

    public AlunoPK getAlunoPK(){
        return id;
    }
    public void setAlunoPK(AlunoPK id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public int getSemestre(){
        return semestre;
    }
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
}



