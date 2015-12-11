package mx.com.nok.mantenimiento.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.flete.model.service.FleteService;
import mx.com.nok.mantenimiento.model.dto.DetalleManttoDTO;
import mx.com.nok.mantenimiento.model.dto.ProgramaManttoDTO;
import mx.com.nok.mantenimiento.model.service.MantenimientoService;
import mx.com.nok.maqune.model.dto.MaquneDTO;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class MantenimientoAction extends ActionSupport implements ServletRequestAware, ServletResponseAware  {
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private MantenimientoService mantenimientoService;
    
    
    

    
    public String mantenimientoTest()
    {
    	try {
    		System.out.println("Entrando a TEST.....");

    		//insert
    		ProgramaManttoDTO dto = new ProgramaManttoDTO();
//    		dto.setIdPrograma("3");
//    		dto.setIdTfalla("1");
//    		dto.setObservaciones("-----");
//    		dto.setIdEmpleado("2");
//    		dto.setFechaProgramado("2013-01-01");
//    		dto.setFechaTerminado("2013-02-02");
//    		dto.setFechaRegistro("2013-05-05");
//    		
//    		System.out.println("Insert : "+mantenimientoService.insertProgramaMantenimiento(dto).toString());
//    		dto.setIdPrograma("");
//    		dto.setIdTfalla("");
//    		dto.setIdEmpleado("");
//    		System.out.println("Retrieve : "+mantenimientoService.infoProgramaMantenimiento(dto).toString());
   
    		
    		//update
//    		dto = new ProgramaManttoDTO();
//    		dto.setIdPrograma("3");
//    		dto.setIdTfalla("1");
//    		dto.setObservaciones("xxxx");
//    		dto.setIdEmpleado("2");
//    		dto.setFechaProgramado("2015-01-01");
//    		dto.setFechaTerminado("2015-02-02");
//    		dto.setFechaRegistro("2015-05-05");
//    		
//    		System.out.println("update : "+mantenimientoService.updateProgramaMantenimiento(dto).toString());
//    		dto.setIdPrograma("");
//    		dto.setIdTfalla("");
//    		dto.setIdEmpleado("");
//    		System.out.println("Retrieve : "+mantenimientoService.infoProgramaMantenimiento(dto).toString());
   
    		//delete
    		dto.setIdPrograma("3");
    		dto.setIdTfalla("1");    		
    		dto.setIdEmpleado("2");
    		
    		
    		System.out.println("delete : "+mantenimientoService.deleteProgramaMantenimiento(dto));
    		dto.setIdPrograma("");
    		dto.setIdTfalla("");
    		dto.setIdEmpleado("");
    		System.out.println("Retrieve : "+mantenimientoService.infoProgramaMantenimiento(dto).toString());
    		
    		
    	
    		
//DetalleManttoDTO dto = new DetalleManttoDTO();
    		//insert 
//    		dto.setIdProgramaMtto("1");
//    		dto.setIdMttoDetalle("5");
//    		dto.setIdEmpleado("2");
//    		dto.setReparacion("---");
//    		dto.setImpedimentos("---");    		
//    		dto.setStatus("A");
//    		dto.setFechaAvance("2013-01-01");
//    		
//    		System.out.println("Insert : "+mantenimientoService.insertDetalleMantenimiento(dto).toString());
//    		dto.setIdProgramaMtto("");
//    		dto.setIdMttoDetalle("");
//    		dto.setIdEmpleado("");
//    		System.out.println("Retrieve : "+mantenimientoService.infoDetalleMantenimiento(dto).toString());
   
    		
    		//update 
    		
//    		dto.setIdProgramaMtto("1");
//    		dto.setIdMttoDetalle("5");
//    		dto.setIdEmpleado("2");
//    		dto.setReparacion("---");
//    		dto.setImpedimentos("---");    		
//    		dto.setStatus("A");
//    		dto.setFechaAvance("2013-12-12");
//    		
//    		System.out.println("update : "+mantenimientoService.updateDetalleMantenimiento(dto).toString());
//    		dto.setIdProgramaMtto("");
//    		dto.setIdMttoDetalle("");
//    		dto.setIdEmpleado("");
//    		System.out.println("Retrieve : "+mantenimientoService.infoDetalleMantenimiento(dto).toString());
    		
    		
//    		
//    		//delete
//    		
//    		dto.setIdProgramaMtto("1");
//    		dto.setIdMttoDetalle("5");
//    		dto.setIdEmpleado("2");
    		
    		
//    		System.out.println("update : "+mantenimientoService.deleteDetalleMantenimiento(dto));
//    		dto.setIdProgramaMtto("");
//    		dto.setIdMttoDetalle("");
//    		dto.setIdEmpleado("");
//    		System.out.println("Retrieve : "+mantenimientoService.infoDetalleMantenimiento(dto).toString());
   
    		  		
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

	public MantenimientoService getMantenimientoService() {
		return mantenimientoService;
	}

	public void setMantenimientoService(MantenimientoService mantenimientoService) {
		this.mantenimientoService = mantenimientoService;
	}



    
    
    
    

}