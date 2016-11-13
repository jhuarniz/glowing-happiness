 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.pwe.gerenciador.servlets; 

/**
 *
 * @author Giovani
 */

public class Filtro {// implements Filter {

//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//    }
//    
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse resp = (HttpServletResponse) response;
//        String uri = req.getRequestURI();
//        
//        //Se for um usuario tentamos identificar ele e aonde esta acessando
//        Usuario usuario = getUsuario(req);
//        if (usuario == null) {
//            System.out.println("usuario deslogado acessando a uri " + req.getRequestURI());
//        } else {
//            System.out.println("usuario " + usuario.getEmail() + " acessando a uri " + req.getRequestURI());
//        }
//        
//        
//        //Se for uma instituicao tentamos identificar ele e aonde esta acessando
//        Instituicao instituicao = getInstituicao(req);
//        if (instituicao == null) {
//            System.out.println("instituicao deslogado acessando a uri " + req.getRequestURI());
//        } else {
//            System.out.println("instituicao " + instituicao.getEmail() + " acessando a uri " + req.getRequestURI());
//        }
//         
//        chain.doFilter(request, response);
//
//    }
//
//
//    
//    private Usuario getUsuario(HttpServletRequest req) {
//        try {
//            //fazer um cast de este elemento de sessao pode dar uma excecao, se o usuarioLogado nao for Usuario, retornamos null
//            Usuario usuario = (Usuario) req.getSession().getAttribute("usuarioLogado");
//            if (usuario == null) {
//                return null;
//            } else {
//                return usuario;
//            }
//        } catch (Exception e) {
//            return null;
//        }
//    }
//    
//    private Instituicao getInstituicao(HttpServletRequest req) {
//        try {
//            //fazer um cast de este elemento de sessao pode dar uma excecao, se o usuarioLogado nao for Instituicao, retornamos null
//            Instituicao instituicao = (Instituicao) req.getSession().getAttribute("usuarioLogado");
//            if (instituicao == null) {
//                return null;
//            } else {
//                return instituicao;
//            }
//        } catch (Exception e) {
//            return null;
//        }
//    }
//    
//    
//    @Override
//    public void destroy() {
//    }

    
}
