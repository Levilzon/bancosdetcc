package br.bancas.bancasdetcc.Componente;

import org.springframework.stereotype.Component;

@Component
public class AlunoComponente {
    private String mensagem;

    public String getMensagem(){
        return mensagem;
    }
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
}
