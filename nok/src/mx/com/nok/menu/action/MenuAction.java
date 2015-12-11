package mx.com.nok.menu.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.articulo.model.service.ArticuloService;
import mx.com.nok.menu.model.dto.MenuDTO;
import mx.com.nok.menu.model.service.MenuService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class MenuAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private MenuService menuService;
    
	
    
    public String menuTest()
    {
    	try{
    		
    		
    		//Prueba Retrieve Menu
    		MenuDTO dto=new MenuDTO();
    		dto.setIdMenu("");
    		dto.setFilterEstatusMenu("");
    		System.out.println("");
    		System.out.println(menuService.catMenu(dto).toString());
    		
    		//Prueba Insercion Menu
//    		dto=new MenuDTO();
//    		dto.setMenu("Menu1");
//    		dto.setNombreCortoMenu("NombreCorto1");
//    		System.out.println( "Se inserto : "+ menuService.insertMenu(dto).toString());
//    		dto.setIdMenu("");
//    		System.out.println(menuService.catMenu(dto).toString());
    		
    		
    		//Prueba Update Menu
//	  		dto=new MenuDTO();
//	   		dto.setIdMenu("7");
//	   		dto.setMenu("Menu1 Cambio");
//	   		dto.setNombreCortoMenu("NombreCorto1 Cambio");
//	   		dto.setEstatus(true);
//	   		
//	   		System.out.println( "Se Modifico : "+ menuService.updateMenu(dto).toString());
//	   		dto.setIdMenu("");
//	   		System.out.println(menuService.catMenu(dto).toString());
	  		
   		
//    		//Prueba Estatus Menu
//   			dto=new MenuDTO();
//    		dto.setIdMenu("7");
//    		dto.setEstatus(false);
//    		System.out.println( "Se Cambia estatus : "+ menuService.updateEstatusMenu(dto).toString());
//    		dto.setIdMenu("");
//    		System.out.println(menuService.catMenu(dto).toString());
    		
    		//Prueba Delete Menu
//	   		dto=new MenuDTO();
//	   		dto.setIdMenu("7");  
//	   		System.out.println( "Seborra : "+ menuService.deleteMenu(dto));
//	   		dto.setIdMenu("");
//	   		System.out.println(menuService.catMenu(dto).toString());
    		
    		
    		
    		
    		
    		return SUCCESS;
    		
    	}
    	catch(Exception e)
    	{
    		
    		e.printStackTrace();
    		return ERROR;
    		
    	}
    	
    	
    }
    
    
	
	
	
	public MenuService getMenuService() {
		return menuService;
	}
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
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

}
