<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url = "../usuario/header.jsp" />

<div class="panel panel-default">
    <div class="panel-heading">
        <h4>Ocorrencias em andamento</h4>
    </div>
    <div class="panel-body">
        <table class="table table-bordered">
            <tr>
                <th>Id</th>
                <th>Tipo</th>
                <th>Data</th>
                <th>Opções</th>
            </tr>

            <c:forEach var="ocorrencia" items="${ocorrencias}">
                <tr>
                    <td>${ocorrencia.idOcorrencia}</td>
                    <td>${ocorrencia.tipo}</td>
                    <td>${ocorrencia.dataHora}</td>
                    <td>
                        <form action="Executa" method="POST">
                            <input type="submit" value="Finalizar!">
                            <input type="hidden" name="classe" value="ControllerOcorrencia">
                            <input type="hidden" name="metodo" value="finalizarOcorrencia">
                            <input type="hidden" name="idOcorrencia" value="${ocorrencia.idOcorrencia}">    
                        </form>
                        
                        <form action="Executa" method="POST">
                            <input type="submit" value="Ver detalhe (TESTE)!">
                            <input type="hidden" name="classe" value="ControllerOcorrencia">
                            <input type="hidden" name="metodo" value="verDetalhe">
                            <input type="hidden" name="idOcorrencia" value="${ocorrencia.idOcorrencia}">    
                        </form>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </div>
</div>

<c:import url = "../usuario/footer.jsp" />