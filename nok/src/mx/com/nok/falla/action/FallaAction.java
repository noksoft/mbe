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
