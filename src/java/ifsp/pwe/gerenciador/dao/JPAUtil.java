/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence; 

/**
 *
 * @author giova
 */
public class JPAUtil {

    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GerenciadorEmpresasJSFPU");

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

}
