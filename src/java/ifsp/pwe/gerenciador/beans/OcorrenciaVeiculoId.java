/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.beans;

import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * ESta classe representa a chave composta da tabela OcorrenciaVeiculo
 * @author 
 */
@Embeddable
public class OcorrenciaVeiculoId implements java.io.Serializable  {
    private Ocorrencia ocorrencia;
    private Veiculo veiculo;

    /**
     * @return the ocorrencia
     */
    @ManyToOne
    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    /**
     * @param ocorrencia the ocorrencia to set
     */
    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    /**
     * @return the veiculo
     */
    @ManyToOne
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.ocorrencia);
        hash = 29 * hash + Objects.hashCode(this.veiculo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OcorrenciaVeiculoId other = (OcorrenciaVeiculoId) obj;
        if (!Objects.equals(this.ocorrencia, other.ocorrencia)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        return true;
    }
    
    
}
