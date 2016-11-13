/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.dao;

import ifsp.pwe.gerenciador.beans.OcorrenciaVeiculo;
import java.sql.SQLException;
import javax.persistence.EntityManager;

/**
 *
 * @author Giovani
 */
public class OcorrenciaVeiculoDAO {
 

    private static EntityManager entityManager;
    public OcorrenciaVeiculoDAO() throws ClassNotFoundException { 
        entityManager = new JPAUtil().getEntityManager();
    }

    public void adiciona(OcorrenciaVeiculo cursocomentario) throws SQLException {
        
        entityManager.getTransaction().begin();
        entityManager.persist(cursocomentario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
