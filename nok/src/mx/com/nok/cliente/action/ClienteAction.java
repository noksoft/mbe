package mx.com.nok.cliente.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.nok.cliente.model.service.ClienteService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ClienteAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());
	private HttpServletRequest servletRequest;
	private HttpServletResponse servletResponse;
	private ClienteService clienteService;
	
	public String clienteTest(){
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
	
	public HttpServletRequest getServletRequest(){
		return servletRequest;
	}
	
	public HttpServletResponse getServletResponse(){
		return servletResponse;
	}

	public ClienteService getClienteService(){
		return clienteService;
	}
	
	public void setClienteService(ClienteService clienteService){
		this.clienteService = clienteService;
	}

}
