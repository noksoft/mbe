package mx.com.nok.adquisicion.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.adquisicion.model.service.IAdquisicionBusiness;
import mx.com.nok.articulo.model.service.ArticuloService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class AdquisicionAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private IAdquisicionBusiness adquisicionBusiness;
    
    
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

	public IAdquisicionBusiness getAdquisicionBusiness() {
		return adquisicionBusiness;
	}

	public void setAdquisicionBusiness(IAdquisicionBusiness adquisicionBusiness) {
		this.adquisicionBusiness = adquisicionBusiness;
	}

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public HttpServletResponse getServletResponse() {
		return servletResponse;
	}

}
