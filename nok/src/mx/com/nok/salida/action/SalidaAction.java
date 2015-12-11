package mx.com.nok.salida.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.requisicion.model.service.RequisicionService;
import mx.com.nok.salida.model.dto.SalidaAlmacenDTO;
import mx.com.nok.salida.model.service.SalidaService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class SalidaAction extends ActionSupport implements ServletRequestAware, ServletResponseAware  {
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private SalidaService salidaService;
    
    
    

    
    public String salidaTest()
    {
    	try {
    		System.out.println("Entrando a TEST.....");
    		
    		SalidaAlmacenDTO dto=new SalidaAlmacenDTO();
    		
    		//insert
//    		dto.setFolioSalida("4");
//    		dto.setIdArticulo("6");
//    		dto.setIdPrograma("1");
//    		dto.setFechaSalida("2010-12-12");
//    		dto.setCantidad(50);
//    		dto.setIdEmpleadoSolicitante("2");
//    		System.out.println("insert: " + salidaService.insertSalidaAlmacen(dto).toString());
//     		dto.setFolioSalida("");    		
//    		dto.setIdArticulo("");
//    		dto.setIdPrograma("");
//    		dto.setIdEmpleadoSolicitante("");
//     		System.out.println("Retrieve: " + salidaService.infoSalidaAlmacen(dto).toString());
//    		
//     		
//     		//update
//     		
//     		dto.setFolioSalida("4");
//    		dto.setIdArticulo("6");
//    		dto.setIdPrograma("1");
//    		dto.setFechaSalida("2019-05-05");
//    		dto.setCantidad(50);
//    		dto.setIdEmpleadoSolicitante("2");
//    		System.out.println("update: " + salidaService.updateSalidaAlmacen(dto).toString());
//     		dto.setFolioSalida("");    		
//    		dto.setIdArticulo("");
//    		dto.setIdPrograma("");
//    		dto.setIdEmpleadoSolicitante("");
//    		System.out.println("Retrieve: " + salidaService.infoSalidaAlmacen(dto).toString());
     		
    		
    		//delete
//    		dto.setFolioSalida("4");
//    		dto.setIdArticulo("6");
//    		dto.setIdPrograma("1");
//    		
//    		dto.setIdEmpleadoSolicitante("2");
//    		System.out.println("delete: " + salidaService.deleteSalidaAlmacen(dto));
//     		dto.setFolioSalida("");    		
//    		dto.setIdArticulo("");
//    		dto.setIdPrograma("");
//    		dto.setIdEmpleadoSolicitante("");
//    		System.out.println("Retrieve: " + salidaService.infoSalidaAlmacen(dto).toString());
     		
     		
    		 
    		//Prueba retrieve Maqune    	
//    		MaquneDTO dto =new MaquneDTO();
//    		dto.setIdMaqune("");
//    		dto.setIdSubmarca("");
//    		dto.setFilterEstatusMaqune("");  
//    		System.out.println("Resultado de maqune: "+mantenimientoService.infoMantenimiento(dto).toString());
    		
    		
    		
    		return SUCCESS;
    	}
    		
    	catch (Exception e){
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

	public SalidaService getSalidaService() {
		return salidaService;
	}

	public void setSalidaService(SalidaService salidaService) {
		this.salidaService = salidaService;
	}

	

}
