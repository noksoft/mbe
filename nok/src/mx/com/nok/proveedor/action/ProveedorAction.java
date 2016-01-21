package mx.com.nok.proveedor.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.falla.model.service.FallaService;
import mx.com.nok.proveedor.model.dto.ProveedorDTO;
import mx.com.nok.proveedor.model.service.ProveedorService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ProveedorAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private ProveedorService proveedorService;
    
    
    public String proveedorTest()
    {
    	try{
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
	public ProveedorService getProveedorService() {
		return proveedorService;
	}
	public void setProveedorService(ProveedorService proveedorService) {
		this.proveedorService = proveedorService;
	}

}
