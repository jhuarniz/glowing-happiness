/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.beans;

import java.util.Date;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author
 */
@Entity
@Table(name = "ocorrenciaveiculo", catalog = "projetoemergencia")
@AssociationOverrides({
    @AssociationOverride(name = "pk.ocorrencia",
            joinColumns = @JoinColumn(name = "idOcorrencia")),
    @AssociationOverride(name = "pk.veiculo",
            joinColumns = @JoinColumn(name = "idVeiculo"))})
public class OcorrenciaVeiculo implements java.io.Serializable {

    private Date data;    
    /**
     * Chave composta
     */
    private OcorrenciaVeiculoId pk = new OcorrenciaVeiculoId();
    
    
    /**
     * @return the pk
     */
    @EmbeddedId
    public OcorrenciaVeiculoId getPk() {
        return pk;
    }

    /**
     * @param pk the pk to set
     */
    public void setPk(OcorrenciaVeiculoId pk) {
        this.pk = pk;
    }

    @Transient
    public Veiculo getVeiculo() {
        return getPk().getVeiculo();
    }
    public void setVeiculo(Veiculo veiculo) {
        getPk().setVeiculo(veiculo);
    }
    
    @Transient
    public Ocorrencia getOcorrencia() {
        return getPk().getOcorrencia();
    }
    
    public void setOcorrencia(Ocorrencia ocorrencia) {
        getPk().setOcorrencia(ocorrencia);
    }
 
    
    
    
    /**
     * @return the data
     */
    @Temporal(TemporalType.DATE)
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }
}
