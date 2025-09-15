package br.bancas.bancasdetcc.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
    private int matriculaNum_1;
    private int matriculaNum_2;
    private int matriculaNum_3;
    private String nome;
    private String curso;
    private int semestre;

    public Aluno(){

    }
    public Aluno(int matriculaNum1, int matriculaNum_2, int matriculaNum_3, String nome, String curso, int semestre){
        this.matriculaNum_1 = matriculaNum_1;
        this.matriculaNum_2 = matriculaNum_2;
        this.matriculaNum_3 = matriculaNum_3;
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
    }

    public int getMatriculaNum_1(){
        return matriculaNum_1;
    }
    public void setMatriculaNum_1(int matriculaNum_1){
        this.matriculaNum_1 = matriculaNum_1;
    }
    public int getMatriculaNum_2(){
        return matriculaNum_2;
    }
    public void setMatriculaNum_2(int matriculaNum_2){
        this.matriculaNum_2 = matriculaNum_2;
    }
    public int getMatriculaNum_3(){
        return matriculaNum_3;
    }
    public void setMatriculaNum_3(int matriculaNum_3){
        this.matriculaNum_3 = matriculaNum_3;
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
