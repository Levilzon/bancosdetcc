package br.bancas.bancasdetcc.entidade;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;


@Entity
@Table(name = "tb_aluno")
public class Aluno{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(name = "nome_aluno")
    private String nome;
    //@Column(name = "curso_aluno")
    private String curso;
    //@Column(name = "aluno_semestre")
    private int semestre;

    public Aluno(){

    }
    public Aluno(Long id, String nome, String curso, int semestre){
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
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



