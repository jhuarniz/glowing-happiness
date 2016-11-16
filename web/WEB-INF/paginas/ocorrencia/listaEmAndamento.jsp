<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url = "../usuario/header.jsp" />

<div class="panel panel-default">
    <div class="panel-heading">
        <h4>Ocorrencias em andamento</h4>
    </div>
    <div class="panel-body"><table class="table table-bordered">
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
                    <td>${ocorrencia.idOcorrencia}</td>
                </tr>
            </c:forEach>

        </table>
    </div>
</div>

<c:import url = "../usuario/footer.jsp" />