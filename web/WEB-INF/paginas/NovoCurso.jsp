
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
                <div id="navbar" class="navbar-collapse collapse">
                    <p class="navbar-text">Logado como ${usuarioLogado.email} 


                    <form action="Executa" method="POST" class="form-signin" name="Logout">
                        <input type="submit" value="Logout!">
                        <input type="hidden" name="classe" value="Logout">
                        <input type="hidden" name="metodo" value="executa">
                    </form>
                </div><!--/.nav-collapse -->
            </div>
        </nav>

        <div class="container">

            <h1>Cadastrar Cursos!</h1> 


            <form action="Executa" method="POST" class="form-group" >

                <div class="input-group">
                    <label for="titulo">Título</label>
                    <input type="text" name="titulo" class="form-control" placeholder="Título" >

                </div>
                <br>
                <div class="input-group">
                    <label for="descricao">Descrição:</label>
                    <input type="text" name="descricao" class="form-control" placeholder="Descrição" >

                </div>
                <br>

                <div class="input-group">
                    <label for="carga">Carga horária:</label>
                    <input type="text" name="carga" class="form-control" placeholder="Carga horária" >

                </div>
                <br>

                <div class="input-group">
                    <label for="preco">Preço:</label>
                    <input type="text" name="preco" class="form-control" placeholder="Preço" >

                </div>
                <br>
                <div class="input-group">
                    <label for="email_coordenador">Email do coordenador do curso:</label>
                    <input type="email" name="email_coordenador" class="form-control" placeholder="Email do coordenador" >

                </div>
                <br>
                <br>

                <input type="submit" value="Enviar">
                <input type="hidden" name="classe" value="NovoCurso">
                <input type="hidden" name="metodo" value="executa">

                <br>

                <div><h2>Realize seu login!</h2></div>
                <a class="btn-primary btn-lg" href="index.jsp"> Clique aqui </a>

            </form> 
            <br/>
            <a href="javascript:window.history.go(-1)">Clique aqui</a> para retornar à página anterior
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

