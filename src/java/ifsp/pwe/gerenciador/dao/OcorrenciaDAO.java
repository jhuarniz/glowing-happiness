/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.dao;

import ifsp.pwe.gerenciador.beans.Ocorrencia;
import ifsp.pwe.gerenciador.beans.OcorrenciaVeiculo;
import ifsp.pwe.gerenciador.beans.Veiculo;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Giovani
 */
public class OcorrenciaDAO {

    private static EntityManager entityManager;

    public OcorrenciaDAO() throws ClassNotFoundException {
        entityManager = new JPAUtil().getEntityManager();
    }

    public void adiciona(Ocorrencia ocorrencia, List<Integer> idVeiculos) throws SQLException {
        entityManager.getTransaction().begin();
        
        for (Integer idVeiculo : idVeiculos) {
            Veiculo veiculo = entityManager.find(Veiculo.class, idVeiculo);
            OcorrenciaVeiculo ocorrenciaVeiculo = new OcorrenciaVeiculo();            
            ocorrenciaVeiculo.setVeiculo(veiculo);            
            ocorrenciaVeiculo.setOcorrencia(ocorrencia);
            ocorrencia.getOcorrenciaVeiculos().add(ocorrenciaVeiculo);
        }
        
        entityManager.persist(ocorrencia);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
