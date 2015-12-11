<%
/**
*   @Objetivo           : jsp header generico de la aplicacion
*   @Autor              : Ricardo Zaragoza Solis.
*   @Objeto             : amfootergenerico.jsp
*   @Fecha Creacion     : 12 Octubre 2014
*   @Versión            : 1.0.0
*/

%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@page import="java.net.URLDecoder" %>
    <%@page import="java.util.Properties" %>
    <%
  /*  Properties props = new Properties();
    String titulo = null;
    String strtitulo = null;
    try{
    if (request.getSession(false) != null) {
		props = (Properties)request.getSession(false).getAttribute("propsURL");
		if(props == null)
			props = new Properties();
	}
    
    titulo = request.getParameter("titpant");
    if(titulo == null){
    	titulo = (String)request.getAttribute("titpant");
    } if(titulo ==null){
    	titulo="";
    }
    strtitulo = props.getProperty(titulo);
    if(strtitulo == null){
    	strtitulo = "";
    }

    }catch(Exception e){
    	System.out.println("ERROR EN HEADER GENERICO");
    	e.printStackTrace();
    }*/
    
    %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<LINK href="/css/template.css" type="text/css" rel="stylesheet">
<LINK href="/css/homepage.css" type="text/css" rel="stylesheet">
<LINK href="/css/amestilologin.css" type="text/css" rel="stylesheet">
<style type="text/css">
body {
	font:Arial, Helvetica, sans-serif;
	font-size:11px;
	background: #FFFFFF;
	border-bottom:0;
	border-left:0;
	border-right: 0;
	border-top:0;
	margin-bottom:0;
	margin-left:0;
	margin-right:0;
	margin-top:0;
}
</style>
</head>
<body>
<div id="AppTitleContainer_" >
	<div id="topNav_">
		<div class="topLeft_NavContainerChico_">&nbsp;</div>
		<div class="topRight_NavContainerChico_">&nbsp;</div>
		<div class="topCenter_NavContainer_">
			<div align="left" style="float:left;text-align:left;width:150px;height:0px;padding-bottom:0px;" >
				<img style="position:relative;top:5px;left:0px; " src="/images/accimarket.jpg" border="0" />
			</div>

			<div style="float:right;text-align:left;">
				<table border = "0" width="100%">					
					<tr>
						<td align="right" valign="center" class="titulopantalla">
							<%//=strtitulo%>Titulo Pantalla
							<a  href="#" onclick="opener.cerrarVentanas();"> 
							<img style="position:relative;top:4px;left:0px; " src="/images/logout.jpg" alt="Logout"  /> </a>
						</td>                   
					</tr>
				</table>
			</div>

			<div class="middleContainer">                          
				<div class="middleLeft_MainNavContainer_"></div>
				<div class="middleRight_MainNavContainer_"></div>
				<div class="middleCenter_MainNavContainer_"></div>
			</div>
		</div>
	</div>
</div> 
</body>

</html>