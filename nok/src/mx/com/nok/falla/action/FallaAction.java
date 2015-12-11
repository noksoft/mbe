package mx.com.nok.falla.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.falla.model.dto.FallaDTO;
import mx.com.nok.falla.model.dto.SubfallaDTO;
import mx.com.nok.falla.model.service.FallaService;
import mx.com.nok.menu.model.service.MenuService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class FallaAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private FallaService fallaService;
    
    public String fallaInit()
    {
    	try{
    		
   		FallaDTO dto=new FallaDTO();
//    		dto.setIdFalla("");    		
//    		System.out.println("Retrieve Falla " + fallaService.catFalla(dto));
//    		
    		
    		//Prueba Insert Falla
//    		dto=new FallaDTO();
//    		dto.setIdFalla("");   
//    		dto.setFalla("Falla xx");    		
//    		System.out.println("Se inserta subfalla: " + fallaService.insertFalla(dto));
//    		dto.setIdFalla("");   
//    		System.out.println("Retrieve Falla " + fallaService.catFalla(dto));
    		
    		
    		//Prueba Update Falla
//    		dto=new FallaDTO();
//    		dto.setIdFalla("6");   
//    		dto.setFalla("Falla xxaaa---");
//    		dto.setEstatus(true);
//    		System.out.println("Se actualiza subfalla: " + fallaService.updateFalla(dto));
//    		dto.setIdFalla("");   
//    		System.out.println("Retrieve Falla " + fallaService.catFalla(dto));
//    		
//    		
//    		//prueba update estatus falla
//    		dto=new FallaDTO();
//    		dto.setIdFalla("6");    		
//    		dto.setEstatus(false);
//    		System.out.println("Se actualiza subfalla: " + fallaService.updateEstatusFalla(dto));
//    		dto.setIdFalla("");   
//    		System.out.println("Retrieve Falla " + fallaService.catFalla(dto));
//    		
    		//Prueba delete falla
//    		dto=new FallaDTO();
//    		dto.setIdFalla("4");    		
//    		
//    		System.out.println("Se borra falla: " + fallaService.deleteFalla(dto));
//    		dto.setIdFalla("");   
//    		System.out.println("Retrieve Falla " + fallaService.catFalla(dto));
    		
    		
    		
    		
    		//Prueba Retrieve Subfalla
    		SubfallaDTO subdto=new SubfallaDTO();
//    		subdto.setIdFalla("");
//    		subdto.setIdSubfalla("");
//    		System.out.println("Retrieve Subfalla " + fallaService.catSubfalla(subdto));
    		
    		//Prueba Insert Subfalla
//    		subdto=new SubfallaDTO();
//    		subdto.setIdFalla("6");
//    		subdto.setSubfalla("Subfalla 33");
//    		
//    		System.out.println("Se inserta subfalla: " + fallaService.insertSubfalla(subdto));
//    		subdto.setIdFalla("");
//    		subdto.setIdSubfalla("");
//    		System.out.println("Retrieve Subfalla " + fallaService.catSubfalla(subdto));
    		
    		
    		   		
//    		subdto=new SubfallaDTO();
//    		subdto.setIdFalla("6");
//    		subdto.setIdSubfalla("2");
//    		subdto.setEstatus(true);
//    		subdto.setSubfalla("Subfalla xx---");
//    		
//    		System.out.println("Se modifica subfalla: " + fallaService.updateSubfalla(subdto));
//    		subdto.setIdFalla("");
//    		subdto.setIdSubfalla("");
//    		System.out.println("Retrieve Subfalla " + fallaService.catSubfalla(subdto));
//    		
    		//Prueba update subfalla
//    		subdto=new SubfallaDTO();
//    		subdto.setIdFalla("6");
//    		subdto.setIdSubfalla("2");
//    		subdto.setEstatus(true);
//    		subdto.setSubfalla("Subfalla xxaaa---");
//    		
//    		System.out.println("Se modifica subfalla: " + fallaService.updateSubfalla(subdto));
//    		subdto.setIdFalla("");
//    		subdto.setIdSubfalla("");
//    		System.out.println("Retrieve Subfalla " + fallaService.catSubfalla(subdto));
    		
    		
    		//Prueba update estatus subfalla
    		
//    		subdto=new SubfallaDTO();
//    		subdto.setIdFalla("6");
//    		subdto.setIdSubfalla("2");
//    		subdto.setEstatus(false);
//    		
//    		
//    		System.out.println("Se modifica estatus subfalla: " + fallaService.updateEstatusSubfalla(subdto));
//    		subdto.setIdFalla("");
//    		subdto.setIdSubfalla("");
//    		System.out.println("Retrieve Subfalla " + fallaService.catSubfalla(subdto));
//    		
    	
    		//Prueba delete subfalla
    		subdto=new SubfallaDTO();
    		subdto.setIdFalla("6");
    		subdto.setIdSubfalla("2");
    	
    		
    		
    		System.out.println("Se borra subfalla: " + fallaService.deleteSubfalla(subdto));
    		subdto.setIdFalla("");
    		subdto.setIdSubfalla("");
    		System.out.println("Retrieve Subfalla " + fallaService.catSubfalla(subdto));
    	
    		
    		
    		return SUCCESS;
    	}
    	catch (Exception e) {
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
	public FallaService getFallaService() {
		return fallaService;
	}
	public void setFallaService(FallaService fallaService) {
		this.fallaService = fallaService;
	}

}
