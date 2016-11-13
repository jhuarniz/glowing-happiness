/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.servlets;

import ifsp.pwe.gerenciador.beans.Ocorrencia;
import ifsp.pwe.gerenciador.beans.OcorrenciaVeiculo;
import ifsp.pwe.gerenciador.dao.OcorrenciaVeiculoDAO;
import ifsp.pwe.gerenciador.dao.OcorrenciaDAO;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Giovani
 */
public class DetalheCurso {
 
//    public String executa(HttpServletRequest req, HttpServletResponse resp) {
//        String idCurso = req.getParameter("idCurso");
//
//        //Buscandos os detalhos do curso dependo do id que chegue do formulario de busca
//        Ocorrencia curso = null;
//        try {
//            curso = new OcorrenciaDAO().buscaPorId(idCurso);
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        //Colocamos o objeto curso disponivel para o jsp conseguir obter ele pelo nome "curso"
//        req.setAttribute("curso", curso);
//
//        Collection<OcorrenciaVeiculo> cursoComentarios = null;
//        try {
//            //Agora buscamos a lista de comentarios do curso usando o mesmo id que chegou do formulario de busca
//            cursoComentarios = new OcorrenciaVeiculoDAO().buscaComentariosPorCurso(idCurso);
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        //Colocamos a lista de comentarios disponivel para o jsp conseguir obter ele pelo nome "comentarios"
//        req.setAttribute("comentarios", cursoComentarios);
//
//        return "/WEB-INF/paginas/DetalheCurso.jsp";
//    }
//
//    
//    //METODO para salvar comentario, este metodo è chamado no formulario de inserir comentario.
//    public String salvaComentario(HttpServletRequest req, HttpServletResponse resp) {
//
//        //recebemos os parametros do formulario para inserir comentarios
//        String comentarioParametro = req.getParameter("comentario");
//        String idCursoParametro = req.getParameter("idCurso");
//
//                
//        try {
//            //Criamos o objeto do tipo OcorrenciaVeiculo para inserir usando o OcorrenciaVeiculoDAO
//            OcorrenciaVeiculo cursoComentario = new OcorrenciaVeiculo();
//            cursoComentario.setComentario(comentarioParametro);
//            cursoComentario.setIdCurso(Integer.parseInt(idCursoParametro)); //temos que fazer Cast do paramero que é String para Integer(int)
//            //cursoComentario.setIdCursoComentario(); //Ainda nao sabemos o id do curso comentario, o DAO quem procura por nós
//            
//            
//            //Inserimos o comentario na tabela curso comentario
//            new OcorrenciaVeiculoDAO().adiciona(cursoComentario);
//            
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        
//        
//        
//        
//        
//        //o bloque a seguir é identico ao metodo executa
//        //Buscandos os detalhos do curso dependo do id que chegue do formulario de salva comentario
//        Ocorrencia curso = null;
//        try {
//            curso = new OcorrenciaDAO().buscaPorId(idCursoParametro);
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        //Colocamos o objeto curso disponivel para o jsp conseguir obter ele pelo nome "curso"
//        req.setAttribute("curso", curso);
//
//        //Agora buscamos a lista de comentarios do curso usando o mesmo id que chegou do formulario de comentario
//        Collection<OcorrenciaVeiculo> cursoComentarios = null;
//        try {
//            cursoComentarios = new OcorrenciaVeiculoDAO().buscaComentariosPorCurso(idCursoParametro);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DetalheCurso.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DetalheCurso.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //Colocamos a lista de comentarios disponivel para o jsp conseguir obter ele pelo nome "comentarios"
//        req.setAttribute("comentarios", cursoComentarios);
//
//        return "/WEB-INF/paginas/DetalheCurso.jsp";
//    }
// 
//    public Boolean verificaPermissao() {
//        return false;
//    }
}
