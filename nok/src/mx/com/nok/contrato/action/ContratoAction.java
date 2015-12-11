package mx.com.nok.contrato.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.contrato.model.services.ContratoService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;

public class ContratoAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());
	private ContratoService contratoService;
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
	
    public String contratoTest(){
    	try {
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
    }
	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;

	}
	
	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}
	public HttpServletResponse getServletResponse() {
		return servletResponse;
	}
	
	public ContratoService getContratoService()
	{
		return contratoService;
	}
	
	public void setContratoService(ContratoService contratoService){
		this.contratoService = contratoService;
	}

}
