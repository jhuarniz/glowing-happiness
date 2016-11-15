/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.dao;

import ifsp.pwe.gerenciador.beans.ServicoDeEmergencia;
import java.sql.SQLException;
import javax.persistence.EntityManager;

/**
 *
 * @author Giovani
 */
public class ServicoDeEmergenciaDAO {

    private static EntityManager entityManager;

    public ServicoDeEmergenciaDAO() throws ClassNotFoundException {
        entityManager = new JPAUtil().getEntityManager();
    }

    public void adiciona(ServicoDeEmergencia servico) throws SQLException {

        entityManager.getTransaction().begin();
        entityManager.persist(servico);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    public ServicoDeEmergencia obterPorId(int id) { 
        ServicoDeEmergencia sde;
        entityManager.getTransaction().begin();
        sde = entityManager.find(ServicoDeEmergencia.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return sde;
    }
    

}
