package com.vinicius.aspect.retorno;


public class Retorno {
    private boolean status;
    private String mensagem;
    private Object conteudo;


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(Object conteudo) {
        this.status = true;
        this.conteudo = conteudo;
    }

    public void setErro(Throwable throwable) {
        this.status = false;
        this.mensagem = throwable.getMessage();
    }
}
