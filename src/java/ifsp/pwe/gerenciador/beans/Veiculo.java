/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.beans;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author
 */
public class Veiculo {

    private int idVeiculo = 1;
    private String desccricao;
    private String numeroPlaca;
    private String status;
    private ServicoDeEmergencia servicoDeEmergencia;

    /**
     * @return the idVeiculo
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
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
    @JoinColumn(name = "idServicoDeEmergencia", nullable = false)
    public ServicoDeEmergencia getServicoDeEmergencia() {
        return servicoDeEmergencia;
    }

    /**
     * @param servicoDeEmergencia the servicoDeEmergencia to set
     */
    public void setServicoDeEmergencia(ServicoDeEmergencia servicoDeEmergencia) {
        this.servicoDeEmergencia = servicoDeEmergencia;
    }

}
