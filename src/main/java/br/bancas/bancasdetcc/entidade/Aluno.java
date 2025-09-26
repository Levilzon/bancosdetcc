package br.bancas.bancasdetcc.entidade;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;


@Entity
@Table(name = "tb_aluno")
public class Aluno{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String universidade;
    private String estado;
    private String curso;
    private String tema;
    private int semestre;

    public Aluno(){

    }
    public Aluno(Long id, String nome, String universidade, String estado, String curso, String tema, int semestre){
        this.id = id;
        this.nome = nome;
        this.universidade = universidade;
        this.estado = estado;
        this.curso = curso;
        this.tema = tema;
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
    public String getUniversidade(){
        return universidade;
    }
    public void setUniversidade(String universidade){
        this.universidade = universidade;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getTema(){
        return tema;
    }
    public void setTema(String tema){
        this.tema = tema;
    }
    public int getSemestre(){
        return semestre;
    }
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
}



