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
public class ControllerOcorrencia {

    @SuppressWarnings("static-access")
    public String cadastro(HttpServletRequest req, HttpServletResponse resp) {        
        System.out.println("Registrar ocorrencia");
        //Recoletamos os parametros do formulario de criacao do ControllerOcorrencia
        String nomeContatoParameter = req.getParameter("nomeContato");
        String numeroContatoParameter = req.getParameter("numeroContato");
        String enderecoParameter = req.getParameter("endereco");
        String descricaoParameter = req.getParameter("descricao");
        String prioridadeParameter = req.getParameter("prioridade");
        String tipoParameter = req.getParameter("tipo");

        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setNomeContato(nomeContatoParameter);
        ocorrencia.setTelefoneContato(numeroContatoParameter);
        ocorrencia.setDataHora(new Date()); //Data Atual
        ocorrencia.setDescricao(descricaoParameter);
        ocorrencia.setEndereco(enderecoParameter);
        ocorrencia.setPrioridade(prioridadeParameter);
        ocorrencia.setTipo(tipoParameter);
        ocorrencia.setStatus("ANDAMENTO");
        
        try {
            List<Integer> idVeiculos= new ArrayList<>();
            idVeiculos.add(1);
            new OcorrenciaDAO().adiciona(ocorrencia, idVeiculos);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        req.setAttribute("ocorrencia", ocorrencia);
        return "/WEB-INF/paginas/ocorrencia/confirmacaoCadastro.jsp";

    }
    
    @SuppressWarnings("static-access")
    public String verCadastro(HttpServletRequest req, HttpServletResponse resp) {
        return "/WEB-INF/paginas/ocorrencia/cadastro.jsp";
    }

    @SuppressWarnings("static-access")
    public String verListaEmAndamento(HttpServletRequest req, HttpServletResponse resp) {
        List<Ocorrencia> ocorrencias = null;
        
        try {
            ocorrencias = new OcorrenciaDAO().buscaEmAndamento();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        req.setAttribute("ocorrencias", ocorrencias);
        return "/WEB-INF/paginas/ocorrencia/listaEmAndamento.jsp";

    }
    
    @SuppressWarnings("static-access")
    public String verDetalhe(HttpServletRequest req, HttpServletResponse resp) {
                System.out.println("INICIO CADASTRO ocorrencia");
        String idOcorrenciaParameter = req.getParameter("idOcorrencia");
        
        Ocorrencia ocorrencia = null;
        try { 
            ocorrencia = new OcorrenciaDAO().obterOcorrencia(Integer.parseInt(idOcorrenciaParameter));
            ocorrencia.getOcorrenciaVeiculos();//Para puxar os veiculos relacionados            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        req.setAttribute("ocorrencia", ocorrencia);
        return "/WEB-INF/paginas/ocorrencia/detalhe.jsp";

    }
    
    @SuppressWarnings("static-access")
    public String finalizarOcorrencia(HttpServletRequest req, HttpServletResponse resp) {
        String idOcorrenciaParameter = req.getParameter("idOcorrencia");
        try { 
            new OcorrenciaDAO().finalizarOcorrencia(Integer.parseInt(idOcorrenciaParameter));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //return "/WEB-INF/paginas/ocorrencia/listaEmAndamento.jsp";
        return verListaEmAndamento(req, resp);

    }
}
