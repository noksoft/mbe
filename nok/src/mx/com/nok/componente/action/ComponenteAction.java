package mx.com.nok.componente.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.articulo.model.service.ArticuloService;
import mx.com.nok.componente.model.dto.ComponenteDTO;
import mx.com.nok.componente.model.dto.ComponentePerfilDTO;
import mx.com.nok.componente.model.service.ComponenteService;
import mx.com.nok.menu.model.dto.MenuDTO;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ComponenteAction extends ActionSupport implements ServletRequestAware, ServletResponseAware  {

	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private ComponenteService componenteService;
	
    
    
    public String componenteTest()
    {
    	try{
    		    		
    		//Prueba Retrieve Componente
    		ComponentePerfilDTO dto=new ComponentePerfilDTO();
    		dto.setIdComponente("");
    		dto.setIdPerfil("");
    		System.out.println("Retrieve : "+componenteService.infoComponentePerfil(dto).toString());
//    		
//    		
//    		dto=new ComponentePerfilDTO();
//    		dto.setIdComponente("9");
//    		dto.setIdPerfil("1");
//    		dto.setFechaPermiso("2013-07-07");
//    		System.out.println("Insert  : "+componenteService.insertComponentePerfil(dto).toString());
//    		
//    		dto.setIdComponente("");
//    		dto.setIdPerfil("");
//    		System.out.println("Retrieve : "+componenteService.infoComponentePerfil(dto).toString());
//    		
//    		
//    		
//    		dto=new ComponentePerfilDTO();
//    		dto.setIdComponente("9");
//    		dto.setIdPerfil("1");
//    		dto.setFechaPermiso("2013-12-12");
//    		System.out.println("update  : "+componenteService.updateComponentePerfil(dto).toString());
//    		
//    		dto.setIdComponente("");
//    		dto.setIdPerfil("");
//    		System.out.println("Retrieve : "+componenteService.infoComponentePerfil(dto).toString());
    		
    		
//    		
//    		
    		dto=new ComponentePerfilDTO();
    		dto.setIdComponente("9");
    		dto.setIdPerfil("1");
    		dto.setFechaPermiso("2013-12-12");
    		System.out.println("Delete  : "+componenteService.deleteComponentePerfil(dto));
    		
    		dto.setIdComponente("");
    		dto.setIdPerfil("");
    		System.out.println("Retrieve : "+componenteService.infoComponentePerfil(dto).toString());
    		
    		
    		
    		
//    		dto.setIdComponente("");
//    		dto.setIdMenu("");
//    		dto.setFilterEstatusComponente("");    	
//    		System.out.println(componenteService.catComponente(dto).toString());
    		
    		//Prueba Insercion Componente
//    		dto=new ComponenteDTO();
//    		dto.setDescripcion("Descripción 1");
//    		dto.setIdMenu("1");
//    		dto.setComponente("Componente 1");
//    		dto.setNombreCortoComponente("Nombre Corto1");
//    		dto.setNombreSubmenu("Nombre submenu");
//    		System.out.println( "Se inserto : "+ componenteService.insertComponente(dto).toString());
//    		dto.setIdMenu("");
//    		dto.setIdComponente("");
//    		System.out.println(componenteService.catComponente(dto).toString());
  		
    		
    		//Prueba Update Componente	  		
//	  		dto=new ComponenteDTO();
//    		dto.setDescripcion("Descripción 1 cambio");
//    		dto.setIdMenu("1");
//    		dto.setIdComponente("77");
//    		dto.setComponente("Componente 1 cambio  ");
//    		dto.setNombreSubmenu("Nombre submenu cambio");
//    		dto.setNombreCortoComponente("Nombre Corto1 cambio");
//    		dto.setEstatus(true);
//	   		
//	   		System.out.println( "Se Modifico : "+ componenteService.updateComponente(dto).toString());
//	   		dto.setIdMenu("");
//    		dto.setIdComponente("");
//	   		System.out.println(componenteService.catComponente(dto).toString());
//	  		
//   		
    		//Prueba Estatus Menu
//   			dto=new ComponenteDTO();
//    		dto.setIdMenu("1");
//    		dto.setIdComponente("77");
//   			dto.setEstatus(false);
//    		
//    		
//    		
//   			System.out.println( "Se Cambia estatus : "+ componenteService.updateEstatusComponente(dto).toString());
//   			dto.setIdMenu("");
//    		dto.setIdComponente("");
//	   		System.out.println(componenteService.catComponente(dto).toString());
    		
    		//Prueba Delete Menu
//	   		dto=new ComponenteDTO();
//	   		dto.setIdMenu("1");
//    		dto.setIdComponente("77");
//	   		System.out.println( "Se borra : "+ componenteService.deleteComponente(dto));
//	   		dto.setIdMenu("");
//    		dto.setIdComponente("");
//	   		System.out.println(componenteService.catComponente(dto).toString());
    		
    		return SUCCESS;
    		
    	}
    	catch(Exception e)
    	{
    		
    		e.printStackTrace();
    		return ERROR;
    		
    	}
    	
    	
    }
    
    
    
    
    
    
	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	public HttpServletResponse getServletResponse() {
		return servletResponse;
	}
	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}
	public ComponenteService getComponenteService() {
		return componenteService;
	}
	public void setComponenteService(ComponenteService componenteService) {
		this.componenteService = componenteService;
	}

}
