<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url = "../usuario/header.jsp" />

<div class="jumbotron">
    <h1>Cadastro de Ocorrencia # ${ocorrencia.idOcorrencia}</h1>
    <p>
        Ocorrencia registrada efetuado com sucesso, socorro a caminho.<br>
        Para finalizar ir na opcao de Ocorrencia de em andamento.
    </p>
</div>
<br/>

<br/>
<a href="javascript:window.history.go(-1)">Clique aqui</a> para retornar à página anterior

<c:import url = "../usuario/footer.jsp" />