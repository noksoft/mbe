package mx.com.nok.requisicion.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.mantenimiento.model.service.MantenimientoService;
import mx.com.nok.requisicion.model.dto.RequisicionDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDetalleDTO;
import mx.com.nok.requisicion.model.service.RequisicionService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class RequisicionAction  extends ActionSupport implements ServletRequestAware, ServletResponseAware  {
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private RequisicionService requisicionService;
    
    
    

    
    public String requisicionValidUser()
    {
    	try {
    		System.out.println("Entrando a TEST.....");
    		RequisicionDetalleDTO dto= new RequisicionDetalleDTO();
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

	public RequisicionService getRequisicionService() {
		return requisicionService;
	}

	public void setRequisicionService(RequisicionService requisicionService) {
		this.requisicionService = requisicionService;
	}

}
