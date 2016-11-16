<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url = "../usuario/header.jsp" /> 
<div class="jumbotron">
    <h1>Cadastro de Ocorrencia # ${ocorrencia.idOcorrencia}</h1>
    <p>
        Ocorrencia registrada efetuado com sucesso, socorro a caminho.<br>
        Para finalizar ir na opcao de <a href="Executa?classe=ControllerOcorrencia&metodo=verListaEmAndamento"> Ocorrencia de em andamento.</a>
    </p>
</div>
<br/> 

<c:import url = "../usuario/footer.jsp" />