package br.bancas.bancasdetcc.entidade;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AlunoPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parte1")
    @SequenceGenerator(name = "parte1", sequenceName = "primeiro_valor", allocationSize = 1)
    @Column(name = "primeiro_valor")
    private Long idNum_1;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parte2")
    @SequenceGenerator(name = "parte2", sequenceName = "segundo_valor", allocationSize = 3)
    @Column(name = "segundo_valor")
    private Long idNum_2;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parte3")
    @SequenceGenerator(name ="parte3", sequenceName ="terceiro_valor", allocationSize = 5)
    @Column(name = "terceiro_numero",nullable = false)
    private Long idNum_3;

    public AlunoPK(){

    }

    public AlunoPK(Long idNum_1, Long idNum_2, Long idNum_3){
        this.idNum_1 = idNum_1;
        this.idNum_2 = idNum_2;
        this.idNum_3 = idNum_3;
    }

    public Long getIdNum_1(){
        return idNum_1;
    }
    public void setIdNum_1(Long idNum_1){
        this.idNum_1 = idNum_1;
    }
    public Long getIdNum_2(){
        return idNum_2;
    }
    public void setIdNum_2(Long idNum_2){
        this.idNum_2 = idNum_2;
    }
    public Long getIdNum_3(){
        return idNum_3;
    }
    public void setIdNum_3(Long idNum_3){
        this.idNum_3 = idNum_3;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AlunoPK alunoPK = (AlunoPK) o;
        return idNum_1 == alunoPK.idNum_1 && idNum_2 == alunoPK.idNum_2 && idNum_3 == alunoPK.idNum_3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNum_1, idNum_2, idNum_3);
    }
}
