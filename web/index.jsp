
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url = "indexHeader.jsp" /> 
<div><h4>Bem vindo ao Sistema Integrado de Socorro!</h4></div>


<!-- Bloco de USUARIOS -->
<div><h3>Login de usuarios</h3></div>

<form action="Executa" method="POST" class="form-signin" name="Login">

    <div class="input-group">
        <span class="input-group-addon" id="basic-addon3">@</span>
        <input type="email" name="email" class="form-control" placeholder="Login" aria-describedby="sizing-addon3">

    </div>
    <br>

    <div class="input-group">
        <span class="input-group-addon" id="basic-addon3">Senha</span>
        <input type="password" name="senha" class="form-control" placeholder="Senha" aria-describedby="sizing-addon3">

    </div>
    <br>

    <input type="submit" value="Enviar">
    <input type="hidden" name="classe" value="Login">
    <input type="hidden" name="metodo" value="executa">

    <br>

    <br>
    <a class="btn-primary btn-lg" href="Executa?classe=ControllerUsuario&metodo=home">Home de usuarios</a> 
    <br>
    <br>
    <br>
</form> 

<c:import url = "indexFooter.jsp" />
