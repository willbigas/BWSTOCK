package br.com.aw.entidade;

import java.sql.Timestamp;

public class Usuario extends Pessoa {

    private String login;
    private String senha;
    private Boolean ativo;
    private Boolean primeiroLogin;
    private Timestamp atualizado;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getPrimeiroLogin() {
        return primeiroLogin;
    }

    public void setPrimeiroLogin(Boolean primeiroLogin) {
        this.primeiroLogin = primeiroLogin;
    }

    public Timestamp getAtualizado() {
        return atualizado;
    }

    public void setAtualizado(Timestamp atualizado) {
        this.atualizado = atualizado;
    }

}
