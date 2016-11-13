/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.dao;

import ifsp.pwe.gerenciador.beans.Ocorrencia;
import java.sql.SQLException;
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

    public void adiciona(Ocorrencia curso) throws SQLException {

        entityManager.getTransaction().begin();
        entityManager.persist(curso);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
