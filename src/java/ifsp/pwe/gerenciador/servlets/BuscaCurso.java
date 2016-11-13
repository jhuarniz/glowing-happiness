/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.servlets;

import ifsp.pwe.gerenciador.beans.Ocorrencia;
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
public class BuscaCurso   {
 
//    public String executa(HttpServletRequest req, HttpServletResponse resp) {
//        String filtro = req.getParameter("filtro");
//        Collection<Ocorrencia> cursos = null;
//        try {
//            cursos = new OcorrenciaDAO().buscaSimilar(filtro);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(BuscaCurso.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(BuscaCurso.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        req.setAttribute("cursos", cursos);
//        return "/WEB-INF/paginas/BuscaCurso.jsp";
//    }
// 
//    public Boolean verificaPermissao() {
//        return false;
//    }
}
