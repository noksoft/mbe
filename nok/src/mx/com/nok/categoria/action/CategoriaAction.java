package mx.com.nok.categoria.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.nok.categoria.model.service.CategoriaService;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class CategoriaAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private CategoriaService categoriaService;
    
    public String categoriaTest()
    {
    	try{
    		
    		//Prueba Insert
//  		CategoriaDTO dto=new CategoriaDTO();		
//   		dto.setIdCategoria("");
//   		dto.setFilterEstatusCategoria("");
//   		System.out.println("Retrieve :" + categoriaService.catCategoriaAopSession(dto));
	
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
	public CategoriaService getCategoriaService() {
		return categoriaService;
	}
	public void setCategoriaService(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

}
