package mx.com.nok.resguardo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.resguardo.model.dto.ResguardoDTO;
import mx.com.nok.resguardo.model.service.ResguardoService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResguardoAction extends  ActionSupport implements ServletRequestAware, ServletResponseAware {
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private ResguardoService resguardoService;
    
    
    
    public String resguardoTest()
    {
    	try { 
    		
    		System.out.println("Entro al evento de resguardo");
            ResguardoDTO dto=new ResguardoDTO();
          /*  System.out.println("Prueba retrieve ");
           System.out.println(resguardoService.getArticuloSinResguardoAopSession().toString());
            dto.setIdArticulo("");
            dto.setIdEmpleado("");
            dto.setIdResguardo("");
           System.out.println( resguardoService.getInfoResguardoAopSession(dto).toString());            
            System.out.println("Finalizo la prueba");
            */
         /*   System.out.println("Prueba insert");
            
            
            
            
            
            dto=new ResguardoDTO();
            dto.setIdEmpleado("2");
            dto.setIdArticulo("8");
            dto.setFechaAsignacion("05/05/2012");
            dto.setComentario("Probando con inserción con el servicio");       
            System.out.println( resguardoService.insertResguardoAopSession(dto).toString());  
            
            
            dto.setIdArticulo("");
            dto.setIdEmpleado("");
            dto.setIdResguardo("");
           System.out.println( resguardoService.getInfoResguardoAopSession(dto).toString());        
           
           
           */
           
           
           dto=new ResguardoDTO();
           dto.setIdResguardo("5");
           dto.setRazonDevolucion("Se devolvio con el servicio");
           dto.setFechaDevolucion("12/12/2012");
           dto.setComentario("Probando devolución con el servicio");       
           System.out.println( resguardoService.devolucionResguardoAopSession(dto).toString());  
           
           
           dto.setIdArticulo("");
           dto.setIdEmpleado("");
           dto.setIdResguardo("");
          System.out.println( resguardoService.getInfoResguardoAopSession(dto).toString());        
          
          
           
    		
    		
    		return SUCCESS;
			
		} catch (Exception e) {
		 e.printStackTrace();
			return ERROR;
		}
    	
    	
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
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	public HttpServletResponse getServletResponse() {
		return servletResponse;
	}
	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ResguardoService getResguardoService() {
		return resguardoService;
	}
	public void setResguardoService(ResguardoService resguardoService) {
		this.resguardoService = resguardoService;
	}
    
}
