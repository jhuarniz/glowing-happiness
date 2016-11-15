
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : NovoUsuarioInserido
    Created on : 18/09/2016, 18:41:56
    Author     : Yuriko
--%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Sistema de Busca de Cursos</title>

        <!-- Bootstrap -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>

        <!-- Static navbar -->
        <nav class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="">Sistema de Busca de Cursos</a>
                </div>

            </div>
        </nav>

        <div class="container">
            <div><h2>Bem vindo ao sistema faça seu cadastro!</h2></div>
            <form action="Executa" method="POST" class="form-group" >

                <div class="input-group">
                    <label for="Nome">Nome:</label>
                    <input type="text" name="nomeContato" class="form-control" placeholder="Nome" >

                </div>
                <br>

                <div class="input-group">
                    <label for="telefone">Telefone:</label>
                    <input type="text" name="telefoneContato" class="form-control" placeholder="Telefone" >

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
                <input type="hidden" name="metodo" value="executa">

                <br>

                <div><h2>Realize seu login!</h2></div>
                <a class="btn-primary btn-lg" href="index.jsp"> Clique aqui </a>

            </form>

        </div>

        <footer class="footer">
            <div class="container">
                <p class="text-muted">Sistema Busca curso - Avaliação PWE</p>
            </div>
        </footer>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
