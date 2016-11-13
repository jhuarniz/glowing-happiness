/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.beans;

import java.util.HashSet;
import java.util.Set;
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

    private int idServicoDeEmergencia;
    private String desccricao;
    private String nome;

    private Set<Veiculo> veiculos = new HashSet<Veiculo>(0);

    /**
     * Relacao de um pra muitos com veiculos
     * @return 
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "veiculo")
    public Set<Veiculo> getVeiculos() {
        return this.veiculos;
    }

    /**
     * @return the idServicoDeEmergencia
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    public int getIdServicoDeEmergencia() {
        return idServicoDeEmergencia;
    }

    /**
     * @param idServicoDeEmergencia the idServicoDeEmergencia to set
     */
    public void setIdServicoDeEmergencia(int idServicoDeEmergencia) {
        this.idServicoDeEmergencia = idServicoDeEmergencia;
    }

    /**
     * @return the desccricao
     */
    public String getDesccricao() {
        return desccricao;
    }

    /**
     * @param desccricao the desccricao to set
     */
    public void setDesccricao(String desccricao) {
        this.desccricao = desccricao;
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
