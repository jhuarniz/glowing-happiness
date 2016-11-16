
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url = "../usuario/header.jsp" />


<h1>Detalhe do curso: </h1>
<p>Nome de contato : ${ocorrencia.nomeContato}</p>
<p>Telefone de contato: ${ocorrencia.telefoneContato}</p>
<p>Descrição: ${ocorrencia.descricao}</p>
<p>Prioridade: ${ocorrencia.prioridade}</p>

<h1>Comentários ou recomendações:</h1>

<ul>            
    <c:forEach var="ocorrenciaVeiculo" items="${ocorrencia.ocorrenciaVeiculos}">
        <li>  ${ocorrenciaVeiculo.veiculo.idVeiculo}   
        </li>
    </c:forEach>
</ul>

<br>
<br>
<a href="javascript:window.history.go(-1)">Clique aqui</a> para retornar à página anterior

<c:import url = "../usuario/footer.jsp" />
