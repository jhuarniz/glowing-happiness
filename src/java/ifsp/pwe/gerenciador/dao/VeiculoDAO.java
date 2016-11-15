/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.dao;

import ifsp.pwe.gerenciador.beans.Veiculo;
import java.sql.SQLException;
import javax.persistence.EntityManager;

/**
 *
 * @author Giovani
 */
public class VeiculoDAO {

    private static EntityManager entityManager;

    public VeiculoDAO() throws ClassNotFoundException {
        entityManager = new JPAUtil().getEntityManager();
    }

    public void adiciona(Veiculo servico) throws SQLException {

        entityManager.getTransaction().begin();
        entityManager.persist(servico);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    public Veiculo obterPorId(int id) { 
        Veiculo sde;
        entityManager.getTransaction().begin();
        sde = entityManager.find(Veiculo.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return sde;
    }
    

}
