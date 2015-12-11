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



List <SeccionDTO>list= (List) request.getSession().getAttribute("usrNokPortlet");


if(list!=null){
	
	for(SeccionDTO dtoSeccionList: list){
		
	
		
		out.println("<p>Informacion Sección</p>");	
		out.println("<br>ID : " + dtoSeccionList.getId_menu());	
		out.println("<br>Nombre (menu) : " + dtoSeccionList.getMenu());	
		out.println("<br>Nombre corto (menu) : " + dtoSeccionList.getNombreCortoMenu());	
	
		
		
		
out.println("<p>Informacion Portlet</p>");	
out.println("<table border=1>");

out.println("<tr>");

out.println("<td>Id_config</td>");
out.println("<td>Main_posicion</td>");
out.println("<td>Posicion</td>");
out.println("<td>Componete_class</td>");
out.println("<td>NombreCortoComponente</td>");
out.println("<td>Nombre_submenu</td>");
out.println("<td>NombreCortoMenu</td>");



out.println("</tr>");


List <PortletDTO>list2=(List) dtoSeccionList.getLisPortlet();
for(PortletDTO dtoList: list2)
{
	out.println("<tr>");
	
	out.println("<td>"+dtoList.getId_config()+"</td>");	
	out.println("<td>"+dtoList.getMain_posicion()+"</td>");
	out.println("<td>"+dtoList.getPosicion()+"</td>");	
	out.println("<td>"+dtoList.getComponente_class()+"</td>");
	out.println("<td>"+dtoList.getNombreCortoComponente()+"</td>");
	out.println("<td>"+dtoList.getNombre_submenu()+"</td>");
	out.println("<td>"+dtoList.getNombreCortoMenu()+"</td>");
	
	
	out.println("</tr>");
}

out.println("</table>");
	}
}
%>



</body>
</html>