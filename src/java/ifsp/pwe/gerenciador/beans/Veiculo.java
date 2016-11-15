/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.beans;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author
 */

@Entity
@Table(name = "veiculo", catalog = "projetoemergencia")
public class Veiculo implements java.io.Serializable {

    private int idVeiculo = 1;
    private String desccricao;
    private String numeroPlaca;
    private String status;
    private ServicoDeEmergencia servicodeemergencia;
    private Set<OcorrenciaVeiculo> ocorrenciaVeiculos = new HashSet<OcorrenciaVeiculo>(0);
    
    /**
     * @return the idVeiculo
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idVeiculo", unique = true, nullable = false)
    public int getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * @param idVeiculo the idVeiculo to set
     */
    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
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
     * @return the numeroPlaca
     */
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    /**
     * @param numeroPlaca the numeroPlaca to set
     */
    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
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
     * @return the servicoDeEmergencia
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idservicodeemergencia", nullable = false)
    public ServicoDeEmergencia getServicodeemergencia() {
        return servicodeemergencia;
    }

    /**
     * @param servicoDeEmergencia the servicoDeEmergencia to set
     */
    public void setServicodeemergencia(ServicoDeEmergencia servicoDeEmergencia) {
        this.servicodeemergencia = servicoDeEmergencia;
    }
    
    
    /**
     * @return the ocorrenciaVeiculos
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.veiculo", cascade={CascadeType.REFRESH, CascadeType.PERSIST,CascadeType.MERGE })
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
