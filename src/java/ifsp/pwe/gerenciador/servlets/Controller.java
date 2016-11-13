/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.servlets;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.ServerException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Giovani
 */
public class Controller extends HttpServlet {

    @Override

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String classe = req.getParameter("classe");

        if (classe == null) {
            throw new IllegalArgumentException("você esqueceu de passar a classe");
        }
        //recebendo o metodo
        String metodo = req.getParameter("metodo");

        if (metodo == null) {
            throw new IllegalArgumentException("você esqueceu de passar a metodo");
        }

        //string da classe (servlet) a ser chamada
        classe = "ifsp.pwe.gerenciador.servlets." + classe;

        try {
            Class<?> tipo = Class.forName(classe);
            Object instancia = tipo.newInstance();

            String pagina = "";
            Method[] allMethods = tipo.getDeclaredMethods();
            for (Method m : allMethods) {
                String nomeMetodo = m.getName();
                if (nomeMetodo.equals(metodo)) {
                    m.setAccessible(true);
                    Object o = m.invoke(instancia, req, resp);
                    pagina = (String) o;
                    //this.redireciona(pagina, req, resp);
                }
            }

            RequestDispatcher requestDispatcher = req.getRequestDispatcher(pagina);
            requestDispatcher.forward(req, resp);
            //Caso não consiga executar a requisição acima exibe as notificações  de erro   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

/* private void redireciona(String pagina, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
 RequestDispatcher requestDispatcher = req.getRequestDispatcher(pagina);
 requestDispatcher.forward(req, resp);
 }*/
