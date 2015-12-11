package mx.com.nok.articulo.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.articulo.model.dto.ArticuloDTO;

import mx.com.nok.articulo.model.dto.SubmarcaDTO;
import mx.com.nok.articulo.model.service.ArticuloService;




import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ArticuloAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private ArticuloService articuloService;
    
    
    
    public String articuloTest()
    {
    	try { 		
    		
     //Prueba busqueda de  Articulo      
       /* ArticuloDTO art =new ArticuloDTO();
        art.setIdArticulo("");
        art.setIdSubmarca("");
    	art.setDescripcion("ddd-");	
    	art.setFilterEstatusArticulo("");
       
        System.out.println(articuloService.buscaArticulo(art).toString());
    		
    		
 
        SubmarcaDTO subdto =new SubmarcaDTO();
        subdto.setIdSubmarca("");
        System.out.println(articuloService.catArticulo(subdto).toString());
              
//       //Prueba update articulo
       ArticuloDTO  artdto=new ArticuloDTO();
     artdto.setIdArticulo("26");  
     artdto.setIdSubmarca("35");
     artdto.setDescripcion("desc art. 1 cambio");
     artdto.setnParte("DCA 123 cambio");
     artdto.setCantidad(25);
     artdto.setStockMin(15);
     artdto.setStockMax(100);
     artdto.setCostoUnitario(28.46);
     artdto.setCostoTotal(35499.58);
     artdto.setEstatus(true);
     artdto.setUbicacion("Ubicaci�n 1 cambio ");
     artdto.setFechaAdquisicion("2013-12-29");    
     System.out.println(articuloService.updateArticulo(artdto));
     System.out.println(articuloService.catArticulo(subdto).toString());
        */
    		
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
	public ArticuloService getArticuloService() {
		return articuloService;
	}
	public void setArticuloService(ArticuloService articuloService) {
		this.articuloService = articuloService;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
   

}
