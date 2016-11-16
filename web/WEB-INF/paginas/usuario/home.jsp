<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url = "header.jsp" />

<h1>Bem vindo ao sistema !</h1>
<br/>
<br/>


Ocorrencia: 
<form action="Executa" method="GET">
    <input type="submit" value="Cadastrar ocorrencia!">
    <input type="hidden" name="classe" value="ControllerOcorrencia">
    <input type="hidden" name="metodo" value="verCadastro"> <br/>
</form>



<c:import url = "footer.jsp" />
