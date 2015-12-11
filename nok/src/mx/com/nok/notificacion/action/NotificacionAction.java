package mx.com.nok.notificacion.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import mx.com.nok.notificacion.model.dto.NotificacionDTO;
import mx.com.nok.notificacion.model.service.NotificacionService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class NotificacionAction  extends ActionSupport implements ServletRequestAware, ServletResponseAware  {
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private NotificacionService notificacionService;
    
    
    
    
    public String notificacionTest()
    {
    	try {
    		
    		//prueba insert
//    		NotificacionDTO dto=new NotificacionDTO();
//    		
//    		dto.setIdNotificacion("");
//    		dto.setIdConfig("");
//    		dto.setIdUsuario("");
//    		System.out.println("Retrieve: " + notificacionService.infoNotificacion(dto)); 
    		    		
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

	public NotificacionService getNotificacionService() {
		return notificacionService;
	}

	public void setNotificacionService(NotificacionService notificacionService) {
		this.notificacionService = notificacionService;
	}
	
	

}
