<%@page import="mx.com.nok.portlet.model.dto.SeccionDTO"%>
<%@page import="mx.com.nok.portlet.model.dto.PortletDTO"%>
<%@page import="java.util.List"%>
<%@page import="mx.com.nok.portlet.action.PortletAction"%>
<%@page import="mx.com.nok.core.usuario.model.dto.UsuarioDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Exito!!!!!!

	<%UsuarioDTO usrdto=(UsuarioDTO) request.getSession().getAttribute("usrNok");
		out.println("<br>");
		out.println("Preparando  información");
		out.println("<br>");
		
		if(usrdto!=null)
		{
			 out.println("Rfc_Usuario : "+usrdto.getRfcUsuario());
			 out.println("<br>");
			 out.println("P_acceso : "+usrdto.getPass());
			 out.println("<br>");
			 out.println("Perfil : "+usrdto.getPerfil());
			 out.println("<br>");
			 out.println("Id_Perfil : "+usrdto.getIdPerfil());
			 out.println("<br>");
			 out.println("Status : "+usrdto.getStatus()); 
		}
		%>

</body>
</html>