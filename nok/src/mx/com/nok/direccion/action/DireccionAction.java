package mx.com.nok.direccion.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.direccion.model.dto.EntidadDTO;
import mx.com.nok.direccion.model.dto.LocalidadDTO;
import mx.com.nok.direccion.model.dto.MunicipioDTO;
import mx.com.nok.direccion.model.service.DireccionService;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;

public class DireccionAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private DireccionService direccionService;
    
    public DireccionService getDireccionService() {
		return direccionService;
	}


	public void setDireccionService(DireccionService direccionService) {
		this.direccionService = direccionService;
	}


	public String direccionTest()
    {
    	try{
    		log.trace("Direccion Test.");
    		System.out.println("Empezando Test dirección");

    		MunicipioDTO mundtoDto=new MunicipioDTO();
    		
    		mundtoDto.setIdEntidad("08");
    		mundtoDto.setIdMunicipio("571");
    		System.out.println("delete Municipio:"+ direccionService.deleteMunicipio(mundtoDto));    		
    		mundtoDto.setIdEntidad("");
    		mundtoDto.setIdMunicipio("");
    		System.out.println("Retrieve Municipio:"+ direccionService.catMunicipio(mundtoDto));
    		
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


}