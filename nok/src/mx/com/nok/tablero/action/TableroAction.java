package mx.com.nok.tablero.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import mx.com.nok.salida.model.service.SalidaService;


import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class TableroAction extends ActionSupport implements ServletRequestAware, ServletResponseAware  {
	
	
	private static final long serialVersionUID = 1L; 
	private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private SalidaService salidaService;
    
    
    

    
    public String tableroTest()
    {
    	try {
    		
    		
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

	public SalidaService getSalidaService() {
		return salidaService;
	}

	public void setSalidaService(SalidaService salidaService) {
		this.salidaService = salidaService;
	}

	

}
