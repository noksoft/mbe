package mx.com.nok.fallaEquipo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.fallaEquipo.model.service.FallaEquipoService;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class FallaEquipoAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = -2031805396388403970L;
	
	private HttpServletRequest servletRequest;
	private HttpServletResponse servletResponse;
	private FallaEquipoService fallaEquipoService;
	
	public String getInitFallaEquipo(){
		try{
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}
	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	
	public HttpServletResponse getServletResponse() {
		return servletResponse;
	}
	@Override
	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	public FallaEquipoService getFallaEquipoService() {
		return fallaEquipoService;
	}

	public void setFallaEquipoService(FallaEquipoService fallaEquipoService) {
		this.fallaEquipoService = fallaEquipoService;
	}

}
