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
    public String executa(HttpServletRequest req, HttpServletResponse resp) {

        
//        try {
//            GenericDAO daaa = new GenericDAO(Veiculo.class);
//            
//            ServicoDeEmergenciaDAO sdao = new ServicoDeEmergenciaDAO();
//            ServicoDeEmergencia se = sdao.obterPorId(1);
//            Veiculo v = new Veiculo();
//            v.setNumeroPlaca("ABX-1234");
//            v.setStatus("LIVRE");
//            v.setDesccricao("AMBULANCIA");
//            daaa.adiciona(se);
//            
////            se.getVeiculos().add(v);
//        } catch ( Exception e) { 
//            e.printStackTrace();
//        }
        
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
        u.setDataHora(new Date()); //Data Atual
        u.setDescricao(descricaoParameter);
        u.setEndereco(enderecoParameter);
        u.setPrioridade(prioridadeParameter);
        u.setTipo(tipoParameter);
        u.setStatus("ANDAMENTO");
        try {
            OcorrenciaDAO dao = new OcorrenciaDAO();
            List<Integer> idVeiculos= new ArrayList<>();
            idVeiculos.add(1);
            dao.adiciona(u, idVeiculos);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //Retornamos para o request o atributo usuario, que contem os dados do usuario inserido.
        req.setAttribute("ocorrencia", u);
        req.setAttribute("processado", "OK");
        
        return "/WEB-INF/paginas/ocorrencia.jsp";

    }

}
