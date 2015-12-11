package mx.com.nok.flete.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.flete.model.dto.FleteDTO;
import mx.com.nok.flete.model.service.FleteService;
import mx.com.nok.maqune.model.dto.MaquneDTO;
import mx.com.nok.maqune.model.service.MaquneService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class FleteAction extends ActionSupport implements ServletRequestAware, ServletResponseAware  {
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private FleteService fleteService;
    
    
    

    
    public String fleteTest()
    {
    	try {
    		System.out.println("Entrando a TEST.....");
    		 
    		//prueba retrieve 
    		FleteDTO dto = new FleteDTO();
    		dto.setIdFlete("");
    		dto.setIdEmpleadoOperador("");
    		dto.setIdMaqune("");    		
    		System.out.println("Retrieve : "+ fleteService.infoFlete(dto));
    		
    		
    		//Prueba Insert
//    		dto = new FleteDTO();
//    		dto.setIdFlete("");
//    		dto.setOrigen("1");
//    		dto.setOrigenLat("origenLat");
//    		dto.setOrigenLng("origenLng");    		
//    		dto.setDestino("destino");
//    		dto.setDestinoLat("destinoLat");
//    		dto.setDestinoLng("destinoLng");
//    		dto.setIdEmpleadoOperador("2");
//    		dto.setCarga("carga");
//    		dto.setFechaLlegada("2013-12-12");
//    		dto.setFechaSalida("2013-01-01");
//    		dto.setStatus("A");
//    		dto.setObservaciones("observaciones");
//    		dto.setIdMaqune("1");
//    		System.out.println("Insert : "+ fleteService.insertFlete(dto));
//    		
//    		
//    		dto.setIdFlete("");
//    		dto.setIdEmpleadoOperador("");
//    		dto.setIdMaqune("");    		
//    		System.out.println("Retrieve : "+ fleteService.infoFlete(dto));
    		
    		
    		//Prueba update
//    		dto = new FleteDTO();
//    		dto.setIdFlete("24");
//    		dto.setOrigen("1");
//    		dto.setOrigenLat("aaa");
//    		dto.setOrigenLng("aaa");    		
//    		dto.setDestino("aa");
//    		dto.setDestinoLat("aa");
//    		dto.setDestinoLng("a");
//    		dto.setIdEmpleadoOperador("2");
//    		dto.setCarga("carga");
//    		dto.setFechaLlegada("2013-12-12");
//    		dto.setFechaSalida("2013-01-01");
//    		dto.setStatus("A");
//    		dto.setObservaciones("observaciones");
//    		dto.setIdMaqune("1");
//    		System.out.println("update : "+ fleteService.updateFlete(dto));    		
//    		
//    		dto.setIdFlete("");
//    		dto.setIdEmpleadoOperador("");
//    		dto.setIdMaqune("");    		
//    		System.out.println("Retrieve : "+ fleteService.infoFlete(dto));
//    		  
    		 
    	//Prueba delete  
    		dto.setIdFlete("24");
    		dto.setIdMaqune("1");
    		dto.setIdEmpleadoOperador("2");
    		System.out.println("delete : "+ fleteService.deleteFlete(dto));    		
    		
    		dto.setIdFlete("");
    		dto.setIdEmpleadoOperador("");
    		dto.setIdMaqune("");    		
    		System.out.println("Retrieve : "+ fleteService.infoFlete(dto));
    		
    		
    		return SUCCESS;
    	}
    		
    	catch (Exception e){
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

	public FleteService getFleteService() {
		return fleteService;
	}

	public void setFleteService(FleteService fleteService) {
		this.fleteService = fleteService;
	}
	

    
    
    
    

}
