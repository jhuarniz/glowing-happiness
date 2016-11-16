<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Sistema Integrado de Socorro</title>

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
                    <a class="navbar-brand" href="">Sistema Integrado de Socorro</a>
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