
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

            <h1>Detalhe do curso: </h1>
            <p>T�tulo do curso : ${curso.titulo}</p>
            <p>Descri��o: ${curso.titulo}</p>
            <p>Carga Hor�ria: ${curso.carga}</p>
            <p>Pre�o: ${curso.preco}</p>
            <p>Email do coordenador do curso: ${curso.emailCoordenador}</p>


            <p>Id da instituicao: ${curso.idInstituicao}</p>
            <br/>



            <h1>Adicionar coment�rio ou recomenda��o:</h1>

            
            
            <!-- Formulario para adicionar comentario -->
            <form action="Executa" method="POST" class="form-group" >
                
                <div class="input-group">
                    <label for="comentario">Coment�rio ou recomenda��o</label>
                    <input type="text" name="comentario" class="form-control" placeholder="Insira seu coment�rio ou recomenda��o do curso" >

                </div>

                <input type="submit" value="Enviar">
                <!-- chamamos a classe detalhe curso -->
                <input type="hidden" name="classe" value="DetalheCurso"> 
                
                <!-- definimos o metodo salvarComentario -->
                <input type="hidden" name="metodo" value="salvaComentario">
                
                <!-- incluimos o id do curso que vai receber o comentario e tambem para recarregar a informacao do curso quando recarregar a tela. -->
                <input type="hidden" name="idCurso" value="${curso.idCurso}">
                <br>
            </form>

            <br>



            <h1>Coment�rios ou recomenda��es:</h1>

            <ul>            
                <c:forEach var="cursoComentario" items="${comentarios}">
                    <li>  ${cursoComentario.comentario}   
                    </li>
                </c:forEach>
            </ul>

            <br>
            <br>
            <a href="javascript:window.history.go(-1)">Clique aqui</a> para retornar � p�gina anterior

        </div>

        <footer class="footer">
            <div class="container">
                <p class="text-muted">Sistema Busca curso - Avalia��o PWE</p>
            </div>
        </footer>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

