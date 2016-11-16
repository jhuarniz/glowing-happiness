
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url = "../usuario/header.jsp" />

<div><h2>Bem vindo ao sistema faça seu cadastro!</h2></div>
<form action="Executa" method="POST" class="form-group" >

    <div class="input-group">
        <label for="Nome">Nome:</label>
        <input type="text" name="nomeContato" class="form-control" placeholder="Nome" >

    </div>
    <br>

    <div class="input-group">
        <label for="telefone">Telefone:</label>
        <input type="text" name="numeroContato" class="form-control" placeholder="Telefone" >

    </div>
    <br>

    <div class="input-group">
        <label for="Email">Endereço:</label>
        <input type="text" name="endereco" class="form-control" placeholder="Endereço" >

    </div>
    <br>

    <div class="input-group">
        <label for="senha">Descrição:</label>
        <input type="text" name="descricao" class="form-control" placeholder="Descrição" >

    </div>
    <br>


    <div class="input-group">
        <label for="prioridadde">Prioridade:</label>
        <select id="prioridade" name="prioridade">
            <option value ="1">Baixa</option>
            <option value ="2">Media</option>
            <option value ="3">Alta</option>
        </select>
    </div>
    <br>

    <div class="input-group">
        <label for="tipo">Tipo:</label>
        <select id="tipo" name="tipo">
            <option value ="1">Crime</option>
            <option value ="2">Incêndio</option>
            <option value ="3">Emergência médica</option>
        </select>

    </div>
    <br>



    <input type="submit" value="Enviar">
    <input type="hidden" name="classe" value="ControllerOcorrencia">
    <input type="hidden" name="metodo" value="cadastro">

    <br>

    <div><h2>Realize seu login!</h2></div>
    <a class="btn-primary btn-lg" href="index.jsp"> Clique aqui </a>

</form>
<c:import url = "../usuario/footer.jsp" />
