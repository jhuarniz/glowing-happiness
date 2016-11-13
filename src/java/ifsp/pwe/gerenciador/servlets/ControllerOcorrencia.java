/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.servlets;

import ifsp.pwe.gerenciador.beans.Ocorrencia;
import ifsp.pwe.gerenciador.beans.Instituicao;
import ifsp.pwe.gerenciador.beans.Usuario;
import ifsp.pwe.gerenciador.dao.OcorrenciaDAO;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giova
 */
public class ControllerOcorrencia {

    @SuppressWarnings("static-access")
    public String executa(HttpServletRequest req, HttpServletResponse resp) {

        System.out.println("Registrar ocorrencia");
        //Recoletamos os parametros do formulario de criacao do ControllerOcorrencia
        String nomeContatoParameter = req.getParameter("nomeContato");
        String numeroContatoParameter = req.getParameter("numeroContato");
        String enderecoParameter = req.getParameter("endereco");
        String descricaoParameter = req.getParameter("descricao");
        String prioridadeParameter = req.getParameter("prioridade");
        String tipoParameter = req.getParameter("tipo");

        Ocorrencia u = new Ocorrencia();
        u.setNomeContato(nomeContatoParameter);
        u.setTelefoneContato(numeroContatoParameter);
        u.setData(new Date()); //Data Atual
        u.setDescricao(descricaoParameter);
        u.setEndereco(enderecoParameter);
        u.setPrioridade(prioridadeParameter);
        u.setTipo(tipoParameter);
        
        try {
            OcorrenciaDAO dao = new OcorrenciaDAO();

//            //IMPORTANTE: Adicionamos o ID da instituicao logada no sistema e colocamos como atributo do objeto curso.
//            Instituicao instituicaoLogado = (Instituicao) req.getSession().getAttribute("usuarioLogado"); //Fazendo cast do objeto em sessao deve ser um objeto da classe Instituicao
//            int idInstituicaoLogada = instituicaoLogado.getId();
            
            //Adicionamos o usuario na BD.
            dao.adiciona(u);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //Retornamos para o request o atributo usuario, que contem os dados do usuario inserido.
        req.setAttribute("ocorrencia", u);
        req.setAttribute("processado", "OK");
        
        return "/WEB-INF/paginas/ocorrencia.jsp";

    }

}
