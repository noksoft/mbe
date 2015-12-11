package mx.com.nok.login.action;
/**
 * Objetivo: Action para el login al sistema NOK
 * @autor: Ricardo Zaragoza Sol��s
 * @since Mayo, 2014
 * @versi���n: 1.0.0
 */



import java.util.Properties;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.login.model.service.LoginService;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ServletRequestAware, ServletResponseAware  {

	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(LoginAction.class);
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private LoginService loginService;
  
  	private Properties props;
    public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
    public String login() {   	
		
		try {
			
			System.out.println(servletRequest);
			System.out.println(servletRequest.getParameter("usuario"));
			System.out.println(servletRequest.getParameter("password"));
			
    		 UsuarioDTO usrdto= new UsuarioDTO();
    		 usrdto.setUsuario(servletRequest.getParameter("usuario"));
    		 usrdto.setPass(servletRequest.getParameter("password"));
    		 
    		 
    		 log.debug("Entrando a validar logueo del usuario : "+usrdto.getUsuario());      		 
    		 usrdto.setIp("102.148.10.01");
    		 usrdto.setStatus(true);

    		 // usrdto.setPass("admin");    		
    		 // usrdto.setUsuario("ZAOC810304NM0");
    		     		     		 
    		 usrdto=(UsuarioDTO)loginService.logIn(usrdto);
    		 
    		 servletRequest.getSession().setAttribute("usrNok", usrdto);
    		 
    		
    		 //usrdto=usrdto.datosBasicos();

    		 if(usrdto.getIdUsuario() != null && usrdto.getIdUsuario() != ""){
    			return SUCCESS;	
    		}else{
    			return SUCCESS;
    		}
    					
		} catch(Exception e) {
			e.printStackTrace();
			log.error("Exception en logueo  :  " + e.getMessage());		
			return SUCCESS;
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
	
	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
	
}
