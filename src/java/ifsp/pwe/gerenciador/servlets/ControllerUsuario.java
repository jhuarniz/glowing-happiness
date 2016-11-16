/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.servlets;

import ifsp.pwe.gerenciador.beans.Ocorrencia;
import ifsp.pwe.gerenciador.dao.OcorrenciaDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giova
 */
public class ControllerUsuario {

    @SuppressWarnings("static-access")
    public String home(HttpServletRequest req, HttpServletResponse resp) {
        return "/WEB-INF/paginas/usuario/home.jsp";

    }
}
