
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

        <!-- Bloco principal -->
        <div class="container">
            <div><h2>Bem vindo ao sistema de emergencia!</h2></div>


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
                <a class="btn-primary btn-lg" href="CadastraOcorrencia.jsp">Cadastro de usuarios</a> 
                <br>
            </form> 
        </div>

        <footer class="footer">
            <div class="container">
                <p class="text-muted">Sistema de emergencia</p>
            </div>
        </footer>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

