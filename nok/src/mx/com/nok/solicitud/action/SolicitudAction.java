package mx.com.nok.solicitud.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import mx.com.nok.solicitud.model.service.ISolicitudBussiness;

public class SolicitudAction extends ActionSupport implements 
			ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 6324286171182577020L;
	
	private Logger log = Logger.getLogger(this.getClass());
	private HttpServletRequest servletRequest;
	private HttpServletResponse servletResponse;
	private ISolicitudBussiness solicitudBussiness;
	
	public String solicitudValidUser(){
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
	
	public HttpServletRequest getServletRequest(){
		return servletRequest;
	}
	
	public HttpServletResponse getServletResponse(){
		return servletResponse;
	}

	public ISolicitudBussiness getSolicitudBussiness() {
		return solicitudBussiness;
	}


	public void setSolicitudBussiness(ISolicitudBussiness solicitudBussiness) {
		this.solicitudBussiness = solicitudBussiness;
	}
	

}
