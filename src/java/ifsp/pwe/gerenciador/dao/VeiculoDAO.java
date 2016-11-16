/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.dao;

import ifsp.pwe.gerenciador.beans.Veiculo;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

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
    public List<Veiculo> listaVeiculosDisponiveis() { 
        //SELECT * FROM veiculo WHERE status = ''
          
        List<Veiculo> lista = 
                (List<Veiculo>)
                entityManager.createQuery("SELECT * FROM veiculo WHERE status = :status") //criando a query                
                .setParameter("status", "LIVRE") //definindo o parametro
                .getResultList();//obtendo o resultado
        
        entityManager.close();
        return lista;
    }
    

}
