package br.bancas.bancasdetcc.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AlunoPK implements Serializable {
    private Long idNum_1;
    private Long idNum_2;
    private Long idNum_3;

    AlunoPK(){

    }

    AlunoPK(Long idNum_1, Long idNum_2, Long idNum_3){
        this.idNum_1 = idNum_1;
        this.idNum_2 = idNum_2;
        this.idNum_3 = idNum_3;
    }

    public Long getNumId_1(){
        return idNum_1;
    }
    public void setNumId_1(Long idNum_1){
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
