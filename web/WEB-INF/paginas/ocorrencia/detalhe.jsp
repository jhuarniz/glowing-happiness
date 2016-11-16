
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url = "../usuario/header.jsp" />
<div class="panel panel-default">
    <div class="panel-heading">
        <h4>Detalhe de ocorrencia</h4>
    </div>
    <div class="panel-body">

        <p>Id Ocorrencia : ${ocorrencia.idOcorrencia}</p>
        <p>Nome de contato : ${ocorrencia.nomeContato}</p>
        <p>Telefone de contato: ${ocorrencia.telefoneContato}</p>
        <p>Descrição: ${ocorrencia.descricao}</p>
        <p>Prioridade: ${ocorrencia.prioridade}</p>
        
        <hr/>
        
        <div class="panel panel-default">
            <div class="panel-heading">
                <h5>Socorro enviado:</h5>
            </div>
            <div class="panel-body">
                <ul>            
                    <c:forEach var="ocorrenciaVeiculo" items="${ocorrencia.ocorrenciaVeiculos}">
                        <li>  ${ocorrenciaVeiculo.veiculo.idVeiculo}   
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>


    </div>
</div>

<c:import url = "../usuario/footer.jsp" />
