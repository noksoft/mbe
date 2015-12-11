package mx.com.nok.empleado.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.nok.empleado.model.service.EmpleadoService;
import mx.com.nok.portlet.action.PortletAction;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;

public class EmpleadoAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(PortletAction.class);
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private EmpleadoService empleadoService;
    
    
    
    public String empleadoTest()
    {
    	try {  		
    		return SUCCESS;
			
		} catch (Exception e) {
		 e.printStackTrace();
			return ERROR;
		}
    }
    
    public String requisicionSolicitudValidUser(){
    	try{
    		return SUCCESS;
    	}catch(Exception e){
    		e.printStackTrace();
    		return ERROR;
    	}
    }

    public Logger getLog() {
		return log;
	}
	public void setLog(Logger log) {
		this.log = log;
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
	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}
	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
}



	
	
