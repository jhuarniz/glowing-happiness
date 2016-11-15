/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.beans;

import java.util.HashSet;
import java.util.Set;
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
@Table(name = "servicodeemergencia", catalog = "projetoemergencia")
public class ServicoDeEmergencia implements java.io.Serializable {

    private int idservicodeemergencia;
    private String descricao;
    private String nome;

    private Set<Veiculo> veiculos = new HashSet<Veiculo>(0);

    /**
     * Relacao de um pra muitos com veiculos
     * @return 
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicodeemergencia")
    public Set<Veiculo> getVeiculos() {
        return this.veiculos;
    }

    /**
     * @return the idservicodeemergencia
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idservicodeemergencia", unique = true, nullable = false)
    public int getIdservicodeemergencia() {
        return idservicodeemergencia;
    }

    /**
     * @param idServicoDeEmergencia the idservicodeemergencia to set
     */
    public void setIdservicodeemergencia(int idServicoDeEmergencia) {
        this.idservicodeemergencia = idServicoDeEmergencia;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param desccricao the descricao to set
     */
    public void setDescricao(String desccricao) {
        this.descricao = desccricao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param veiculos the veiculos to set
     */
    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

}
