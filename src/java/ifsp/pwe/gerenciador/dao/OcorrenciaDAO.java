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
import java.util.Date;
import java.util.List;
import java.util.Set;
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

        if (idVeiculos != null) {
            //iteramos a lista de ids de veiculos
            for (Integer idVeiculo : idVeiculos) {
                //Procuramos o veiculo que coincida com o id
                Veiculo veiculo = entityManager.find(Veiculo.class, idVeiculo);
                veiculo.setStatus("OCUPADO");//marcamos o veiculo como OCUPADO
                
                //Criamos o registro que vincula o veiculo e a ocorrencia
                OcorrenciaVeiculo ocorrenciaVeiculo = new OcorrenciaVeiculo();
                ocorrenciaVeiculo.setVeiculo(veiculo);
                ocorrenciaVeiculo.setOcorrencia(ocorrencia);
                ocorrenciaVeiculo.setData(new Date());
                
                //finalmente adicionamos o registro de vinculo com a ocorrencia
                ocorrencia.getOcorrenciaVeiculos().add(ocorrenciaVeiculo);
            }
        }

        entityManager.persist(ocorrencia);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<Ocorrencia> buscaEmAndamento() {
        List<Ocorrencia> lista
                = (List<Ocorrencia>) entityManager.createQuery("SELECT o FROM Ocorrencia o WHERE status = :status") //criando a query
                .setParameter("status", "ANDAMENTO") //definindo o parametro
                .getResultList();//obtendo o resultado        
        entityManager.close();
        return lista;
    }

    public void finalizarOcorrencia(int idOcorrencia) {
        
        entityManager.getTransaction().begin();
        
        //Procuramos pela ocorrencia
        Ocorrencia ocorrencia
                = (Ocorrencia) entityManager.createQuery("SELECT o FROM Ocorrencia o WHERE idOcorrencia = :idOcorrencia") //criando a query
                .setParameter("idOcorrencia", idOcorrencia) //definindo o parametro                        
                .getSingleResult();//obtendo o resultado     
        //Se existir a ocorrencia
        if (ocorrencia != null) {
            
            //marcamos como estado finalizado
            ocorrencia.setStatus("FINALIZADO");
            
            //recuperamos a lista de ocorrenciaVeiculos
            Set<OcorrenciaVeiculo> ovs = ocorrencia.getOcorrenciaVeiculos();

            //iteramos a lista ocorrenciaVeiculos e marcamos os veiculos como liberados
            for (OcorrenciaVeiculo ov : ovs) {
                //recuperamos o veiculo
                Veiculo veiculo =  ov.getVeiculo();
                veiculo.setStatus("LIVRE");//marcamos o veiculo como LIVRE
            }
            
            //finalmente salvamos as alteracoes.
            entityManager.persist(ocorrencia);
        }
        entityManager.getTransaction().commit();      
        entityManager.close();
    }
    
    public Ocorrencia obterOcorrencia(int idOcorrencia) {
        Ocorrencia ocorrencia
                = (Ocorrencia) entityManager.createQuery("SELECT o FROM Ocorrencia o WHERE idOcorrencia = :idOcorrencia") //criando a query
                .setParameter("idOcorrencia", idOcorrencia) //definindo o parametro                        
                .getSingleResult();//obtendo o resultado        
        entityManager.close();
        return ocorrencia;
    }
}
