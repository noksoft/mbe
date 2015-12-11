<%
/**
*   @Objetivo           : jsp de login
*   @Autor              : Roberto C. Trejo .
*   @Objeto             : amlogin.jsp
*   @Fecha Creacion     : 13 Octubre 20014

*/
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%
  /*  response.addHeader("Pragma","no-cache");
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate,pre-check=0,post-check=0");
    response.setDateHeader("Expires",0); 
    request.setCharacterEncoding("ISO-8859-1");
	response.setContentType("text/html; charset=ISO-8859-1");*/
    %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>MAQZAR : Management Mechanical Workshop</title>

    <!-- Bootstrap core CSS -->
    <link href="/nok/jsp/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
       <style type="text/css">
   body {
  min-height: 2000px;
}

.navbar-static-top {
  margin-bottom: 19px;
}
html{
    /* This image will be displayed fullscreen */
    background:url('/nok/jsp/bootstrap/img/taller1.jpg') no-repeat center center;

    /* Ensure the html element always takes up the full height of the browser window */
    min-height:100%;

    /* The Magic */
    background-size:cover;
}

body{
    /* Workaround for some mobile browsers */
    min-height:100%;
}

   </style>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  <script type="text/javascript" src="/js/nokmenu.js?dev=<%=(int)(Math.random()*100)%>"></script>

  </head>
  
<body onload="doRecargar();javascript:relocation(); document.getElementById('usuario').focus();">

 <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">MAQZAR : Management Mechanical Workshop</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
           
          </ul>
         
        </div><!--/.nav-collapse -->
      </div>
    </nav>
<div>

<div class="container">
     <div class="col-sm-3">
<div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">Login</h3>
            </div>
            <div class="panel-body">
              <form  action="<%=request.getContextPath()%>/login/login.action" id="loginform" method="POST">
						<table>	
							<tr>
								<td class="labellogin">
									Usuario:<br>
									<input id="usuario" name="usuario" value="ZAOC810304NM0" size="20" maxlength="15" onkeypress="javascript:validalogin(event);" autocomplete="off">
								</td>
								<td colspan="2 ">
									
								</td>
							</tr>
							<tr><br>
								<td class="labellogin">
									Password:<br>
									<input type="password" id="password" name="password" value="za" size="20" maxlength="10" onkeypress="javascript:validalogin(event);" autocomplete="off">
								
								</td>
							
								<td align= "right" colspan="2">
									</td>
							</tr>
							<tr>	
								<td align="left">
								<br>
									<input type="button" id="Aceptar" name="Aceptar" value="Aceptar" class="btn btn-sm btn-primary" onclick="javascript:validalogin2();"/>
									&nbsp;
									<input type="button" id="Cancelar" name="Cancelar" value="Limpiar" class ="btn btn-sm btn-default" onclick="limpiaLogin();"/>
								</td>
							</tr>
						</table>
						<input type="hidden" name="__RequestVerificationToken" value=""/>						
					</form>	
            </div>
          </div>

</div>
	</div>
	</div>	
          



 <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/nok/jsp/bootstrap/js/jquery.min.js"></script>
    <script src="/nok/jsp/bootstrap/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
</body>
</html>