package mx.com.nok.adquisicion.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import mx.com.nok.adquisicion.model.service.AdquisicionService;

public class AdquisicionAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private AdquisicionService adquisicionService;
    
    
    public String adquisicionValidUser()
    {
    	try { 		
    		
    		return SUCCESS;
			
		} catch (Exception e) {
		 e.printStackTrace();
			return ERROR;
		}
    	
    	
    }
    
    public String asignacionrecursotallerValidUser(){
    	try{
    		return SUCCESS;
    	}catch(Exception e){
    		e.printStackTrace();
    		return ERROR;
    	}
    }
	
	@Override
	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
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

	public HttpServletResponse getServletResponse() {
		return servletResponse;
	}

	public AdquisicionService getAdquisicionService() {
		return adquisicionService;
	}

	public void setAdquisicionService(AdquisicionService adquisicionService) {
		this.adquisicionService = adquisicionService;
	}

}
