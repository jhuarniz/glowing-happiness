/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.servlets;

import ifsp.pwe.gerenciador.beans.Usuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Giovani
 */
public class Login {

    public String executa(HttpServletRequest req, HttpServletResponse resp) {
//        String email = req.getParameter("email");
//        String senha = req.getParameter("senha");
//        Usuario usuario = null;
//        try {
//            usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        if (usuario == null) {
//            return "/WEB-INF/paginas/LoginInvalido.html";
//        } else {
            HttpSession session = req.getSession();
            session.setAttribute("usuarioLogado", new Usuario("teste@asdas.com", "aaaa"));
            return "/WEB-INF/paginas/Painel.jsp";
//        }
    }

    public Boolean verificaPermissao() {
        return false;
    }

}
