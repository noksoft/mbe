package mx.com.nok.obra.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import mx.com.nok.obra.model.service.ObraService;

public class ObraAction  extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(ObraAction.class);
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private ObraService obraService;
    
    
    
    
    public ObraService getObraService() {
		return obraService;
	}

	public void setObraService(ObraService obraService) {
		this.obraService = obraService;
	}

	public String obraTest()
    {
    	try {
    		System.out.println("Entrando a TEST.....");
 		
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
	
}
