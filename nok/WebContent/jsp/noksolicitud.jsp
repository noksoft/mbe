<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
/**
 * Muestra la pantalla de Adquisiciones
 *     
 * @nombre	nokadquisicion.jsp                                                                                   
 * @version	1.0.0
 * @author	Rizardo Zaragoza Solís
 * @since 	23 de MArzo del 2015
 *
*/ 
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="java.util.Properties"%>
<html>
<head>
<title>Solicitudes</title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<script type="text/javascript" src="/js/swfobject.js"></script>
</head>
<body onLoad="document.getElementById('v8').focus();">
	<!-- div id="headerGenericoID" align="center" class="headerGenerico">
		<jsp:include page="/jsp/amheadergenerico.jsp"></jsp:include>
	</div-->

	<div id="flashcontent" align="center" width="100%" style="padding-left:-0px; z-index:300;" >
			<script language="Javascript">
                                // <![CDATA[
											var so = new FlashObject("/flash/Solicitudes.swf", "v8", "100%", "100%", "8");
											so.addVariable("lang", "en");
											so.addVariable("enforce", "0");
											so.addParam("movie", "/flash/Solicitudes.swf");
											so.addParam("quality", "high");
											so.addParam("bgcolor", "#FFFFFF");
											so.addParam("wmode", "transparent");
											so.addParam("align","bottom");
											so.addParam("FlashVars","Solicitudes");
											so.addParam("allowScriptAccess","Never");
											so.addParam("allowNetworking","All");
											so.write("flashcontent");
											// ]]>
            </script>
	</div>
	<!-- div id="footerGenericoID" align="center" class="footerGenerico">
		<jsp:include page="/jsp/amfootergenerico.jsp"></jsp:include>
	</div-->
</body>
</html>



