package mx.com.nok.proveedor.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.falla.model.service.FallaService;
import mx.com.nok.proveedor.model.dto.ProveedorDTO;
import mx.com.nok.proveedor.model.service.ProveedorService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ProveedorAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private ProveedorService proveedorService;
    
    
    public String proveedorTest()
    {
    	try{
    		
    		//Prueba retrieve proveedor    		
    		ProveedorDTO dto= new ProveedorDTO();
    		dto.setIdProveedor("");
    		dto.setRfcProveedor("");
    		System.out.println("");
    		System.out.println(proveedorService.catProveedor(dto).toString());
    		
    		
    		//Prueba insert proveedor 
//    		dto= new ProveedorDTO();
//    		dto.setRfcProveedor("AAAAAAAAA");
//    		dto.setRazonSocial("Razon Social");
//    		dto.setNombreContacto("Nombre contacto");
//    		dto.setTelefonoEmpresa("555555555");
//    		dto.setCelularEmpleado("88888888");
//    		dto.setwww("www.dddddd.com");
//    		dto.setCorreo("aaaa.@gmail.com");
//    		dto.setIdLocalidad("1715");
//    		dto.setIdMunicipio("027");
//    		dto.setIdEntidad("08");
//    		dto.setNombreComercial("Nombre comercial");
//    		System.out.println( "Se inserto : "+ proveedorService.insertProveedor(dto).toString());
//    		
//    		dto.setIdProveedor("");    		
//    		System.out.println("");
//    		System.out.println(proveedorService.catProveedor(dto).toString());
    		
    		
    		//Prueba update Proveedor
//    		dto= new ProveedorDTO();
//    		dto.setIdProveedor("1");
//    		dto.setRfcProveedor("AAAAAAAAA");
//    		dto.setRazonSocial("Razon xxxx Social");
//    		dto.setNombreContacto("Nombre xxxx contacto");
//    		dto.setTelefonoEmpresa("555555555");
//    		dto.setCelularEmpleado("88888888");
//    		dto.setwww("www.ddxxxxxxdddd.com");
//    		dto.setCorreo("axxxxaaa.@gmail.com");
//    		dto.setIdLocalidad("1715");
//    		dto.setIdMunicipio("027");
//    		dto.setIdEntidad("08");
//    		dto.setNombreComercial("Nombre xxxxxx comercial");
//    		dto.setEstatus(true);
//    		System.out.println( "Se modifico proveedor : "+ proveedorService.updateProveedor(dto).toString());
//    		
//    		dto.setIdProveedor("");    		
//    		System.out.println("");
//    		System.out.println(proveedorService.catProveedor(dto).toString());
    		
    		
    		//Pruba cambio estatus proveedor
//    		dto= new ProveedorDTO();
//    		dto.setIdProveedor("1");
//    		dto.setRfcProveedor("AAAAAAAAA");    		
//    		dto.setEstatus(false);
//    		System.out.println( "Se modifico estatus proveedor : "+ proveedorService.updateEstatusProveedor(dto).toString());
//    		
//    		dto.setIdProveedor("");    		
//    		System.out.println("");
//    		System.out.println(proveedorService.catProveedor(dto).toString());
    		
    		
    		//Prueba borrado proveedor
//    		dto= new ProveedorDTO();
//    		dto.setIdProveedor("1");
//    		dto.setRfcProveedor("AAAAAAAAA");    		
//    		dto.setEstatus(false);
//    		System.out.println( "Se modifico estatus proveedor : "+ proveedorService.deleteProveedor(dto));
//    		
//    		dto.setIdProveedor("");    		
//    		System.out.println("");
//    		System.out.println(proveedorService.catProveedor(dto).toString());
    		
    		
    		
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
	public ProveedorService getProveedorService() {
		return proveedorService;
	}
	public void setProveedorService(ProveedorService proveedorService) {
		this.proveedorService = proveedorService;
	}

}
