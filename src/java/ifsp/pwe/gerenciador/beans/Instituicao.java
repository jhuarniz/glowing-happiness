/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.beans;

/**
 *
 * @author Giovani
 */
public class Instituicao {

    private int idInstituicao = 1;
    private String nome;
    private String endereco;
    private String email;
    private String senha;
    private int telefone;

    public Instituicao(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Instituicao(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getId() {
        return idInstituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setIdInstituicao(int idInstituicao) {
        this.idInstituicao = idInstituicao;

    }

}
