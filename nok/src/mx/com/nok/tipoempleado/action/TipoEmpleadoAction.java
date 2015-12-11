package mx.com.nok.tipoempleado.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class TipoEmpleadoAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{

		private static final long serialVersionUID = 1L;
		private HttpServletRequest servletRequest;
		private HttpServletResponse servletResponse;
		
		public String TipoEmpleadoTest()
		{
			try {
				return SUCCESS;
			} catch (Exception e) {
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
