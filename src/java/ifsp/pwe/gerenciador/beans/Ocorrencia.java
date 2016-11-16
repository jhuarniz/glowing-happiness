/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author
 */
@Entity
@Table(name = "ocorrencia", catalog = "projetoemergencia")
public class Ocorrencia implements java.io.Serializable {

    private int idOcorrencia = 1;
    private String nomeContato;
    private String telefoneContato;
    private String descricao;
    private String prioridade;
    private String tipo;
    private String status;
    private Date dataHora;
    private String endereco;

    private Set<OcorrenciaVeiculo> ocorrenciaVeiculos = new HashSet<OcorrenciaVeiculo>(0);

    /**
     * @return the idOcorrencia
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idOcorrencia", unique = true, nullable = false)
    public int getIdOcorrencia() {
        return idOcorrencia;
    }

    /**
     * @param idOcorrencia the idOcorrencia to set
     */
    public void setIdOcorrencia(int idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    /**
     * @return the nomeContato
     */
    public String getNomeContato() {
        return nomeContato;
    }

    /**
     * @param nomeContato the nomeContato to set
     */
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    /**
     * @return the telefoneContato
     */
    public String getTelefoneContato() {
        return telefoneContato;
    }

    /**
     * @param telefoneContato the telefoneContato to set
     */
    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the prioridade
     */
    public String getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the dataHora
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * @param data the dataHora to set
     */
    public void setDataHora(Date data) {
        this.dataHora = data;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the ocorrenciaVeiculos
     */
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "pk.ocorrencia", cascade={CascadeType.REFRESH, CascadeType.PERSIST,CascadeType.MERGE })
    public Set<OcorrenciaVeiculo> getOcorrenciaVeiculos() {
        return ocorrenciaVeiculos;
    }

    /**
     * @param ocorrenciaVeiculos the ocorrenciaVeiculos to set
     */
    public void setOcorrenciaVeiculos(Set<OcorrenciaVeiculo> ocorrenciaVeiculos) {
        this.ocorrenciaVeiculos = ocorrenciaVeiculos;
    }

}
