package mx.com.nok.maqune.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.maqune.model.dto.MaquneChkListDTO;
import mx.com.nok.maqune.model.dto.MaquneDTO;
import mx.com.nok.maqune.model.dto.MaquneEmpleadoDTO;
import mx.com.nok.maqune.model.dto.MaquneRentaDTO;
import mx.com.nok.maqune.model.service.MaquneService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class MaquneAction  extends ActionSupport implements ServletRequestAware, ServletResponseAware  {
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private MaquneService maquneService;
    
    
    
    
    public String maquneTest()
    {
    	try {
    		
    		
    		//prueba insert
   		MaquneRentaDTO dto=new MaquneRentaDTO();
//    		dto.setFolioRenta("1");
//    		dto.setIdProveedor("1");
//    		dto.setCostoRenta(10.50);
//    		dto.setSueldoOperador(20.50);
//    		dto.setStatus("I");
//    		dto.setFechaRegreso("2013-10-10");
//    		dto.setFechaRenta("2016-01-01");
//    		dto.setIdMaqune("1");
//    		
//    		
//    		System.out.println("insert: " + maquneService.insertMaquneRenta(dto));
//    		dto.setIdProveedor("");
//    		dto.setIdMaqune("");
//    		dto.setFolioRenta("");
//    		System.out.println("Retrieve: " + maquneService.infoMaquneRenta(dto));
//    		
//    		
//    		//PRUEBA UPDATE
//    		dto=new MaquneRentaDTO();
//       		dto.setFolioRenta("1");
//    		dto.setIdProveedor("1");
//    		dto.setCostoRenta(200.50);
//    		dto.setSueldoOperador(320.50);
//    		dto.setStatus("I");
//    		dto.setFechaRegreso("2013-12-12");
//    		dto.setFechaRenta("2019-01-01");
//    		dto.setIdMaqune("1");
//    		
//    		
//    		System.out.println("insert: " + maquneService.updateMaquneRenta(dto));
//    		dto.setIdProveedor("");
//    		dto.setIdMaqune("");
//    		dto.setFolioRenta("");
//    		System.out.println("Retrieve: " + maquneService.infoMaquneRenta(dto));
//    		
//    		//prueba delete
//    		dto=new MaquneRentaDTO();
//       		dto.setFolioRenta("1");
//    		dto.setIdProveedor("1");    		
//    		dto.setIdMaqune("1");
////    		
//    		
//    		System.out.println("delete: " + maquneService.deleteMaquneRenta(dto));
//    		dto.setIdProveedor("");
//    		dto.setIdMaqune("");
//    		dto.setFolioRenta("");
//    		System.out.println("Retrieve: " + maquneService.infoMaquneRenta(dto));
    		
    		
    		//prueba insert
//   		MaquneEmpleadoDTO dto =new MaquneEmpleadoDTO();
//    		dto.setIdEmpleado("2");
//    		dto.setIdMaqune("1");
//    		dto.setFechaAlta("2013-09-09");
//    	
//    		System.out.println("insert: " + maquneService.insertMaquneEmpleado(dto));
//    		
//    		dto.setIdMaqune("");
//    		System.out.println("Retrieve: " + maquneService.infoMaquneEmpleado(dto));
//    		
//    		//prueba update
//    		 dto =new MaquneEmpleadoDTO();
//     		dto.setIdEmpleado("2");
//     		dto.setIdMaqune("1");
//     		dto.setFechaAlta("2015-01-01");
//     	
//     		System.out.println("update: " + maquneService.updateMaquneEmpleado(dto));
//     		
//     		dto.setIdMaqune("");
//     		System.out.println("Retrieve: " + maquneService.infoMaquneEmpleado(dto));
     		
     		
     		
     		//prueba delete
//    		dto =new MaquneEmpleadoDTO();
//     		dto =new MaquneEmpleadoDTO();
//    		dto.setIdEmpleado("2");
//    		dto.setIdMaqune("1");   	
//    	
//    		System.out.println("delete: " + maquneService.deleteMaquneEmpleado(dto));    		
//    		dto.setIdMaqune("");
//    		System.out.println("Retrieve: " + maquneService.infoMaquneEmpleado(dto));
    		
    		
    		
//    		MaquneChkListDTO dto =new MaquneChkListDTO();
	
    		
    		
    		//prueba retireve 
//    		dto.setIdMaqune("");
//    		System.out.println("Retrieve: " + maquneService.infoMaquneChkList(dto));

//    		dto =new MaquneChkListDTO();
//    		
//    		dto.setIdMaqune("1");
//    		dto.settCirculacion(true);
//    		dto.setVerificacion(true);
//    		dto.setFactura(true);
//    		dto.setTenencia(true);
//    		dto.setTituloPedimentos(true);
//    		dto.setPermisoTrailer(true);
//    		dto.setCambioAceite(1);
//    		dto.setCombustible("G");    		
//    		dto.setTipoMedida("H");
//    		dto.setFechaVerificacion("2013-01-01");
//    		dto.setFechaTenencia("2013-06-06");
//    		System.out.println("insert: " + maquneService.insertMaquneChkList(dto));
//    		
//    		dto.setIdMaqune("");
//    		System.out.println("Retrieve: " + maquneService.infoMaquneChkList(dto));
//    		
    		
    		//prueba update
    		
//    		dto =new MaquneChkListDTO();
//    		
//    		dto.setIdMaqune("1");
//    		dto.settCirculacion(false);
//    		dto.setVerificacion(false);
//    		dto.setFactura(false);
//    		dto.setTenencia(false);
//    		dto.setTituloPedimentos(false);
//    		dto.setPermisoTrailer(false);
//    		dto.setCambioAceite(1);
//    		dto.setCombustible("G");    		
//    		dto.setTipoMedida("H");
//    		dto.setFechaVerificacion("2013-11-11");
//    		dto.setFechaTenencia("2013-06-06");
//    		System.out.println("Retrieve: " + maquneService.updateMaquneChkList(dto));
//    		
//    		dto.setIdMaqune("");
//    		System.out.println("Retrieve: " + maquneService.infoMaquneChkList(dto));
//    		
//    		
    		//prueba delete    		
//    		dto =new MaquneChkListDTO();    		
//    		dto.setIdMaqune("1");
//    		
//    		System.out.println("delete: " + maquneService.deleteMaquneChkList(dto));    		
//    		dto.setIdMaqune("");
//    		System.out.println("Retrieve: " + maquneService.infoMaquneChkList(dto));
//    		
    		
    		
    		
//    		System.out.println("Entrando a TEST.....");
//    		//Prueba retrieve Maqune    	
    		//MaquneDTO dto =new MaquneDTO();
//    		dto.setIdMaqune("");
//    		dto.setIdSubmarca("");
//    		dto.setFilterEstatusMaqune("");  
//    		System.out.println("Resultado de maqune: "+maquneService.infoMaqune(dto).toString());
//    		
    		//prueba insert 
    		
//    		dto =new MaquneDTO();
//    		dto.setIdMaqune("7");
//    		dto.setNombre("nombre");
//    		dto.setIdSubmarca("1");
//    		dto.setDescripcion("xxxxxxdescripcion");
//    		dto.setnSerie("nnnserie");
//    		dto.setTipoAdq("R");
//    		dto.setFoto("mifoto");
//    		dto.setFechaAdq("2013-06-06");
//    		
//    		System.out.println("Resultado de insert maqune: "+maquneService.insertMaqune(dto));
//    		dto.setFilterEstatusMaqune("");  
//    		dto.setIdMaqune("");
//    		dto.setIdSubmarca("");
//    		System.out.println("Resultado de maqune: "+maquneService.infoMaqune(dto).toString());
    		
//    		
//    		
//    		//prueba prueba update 
//    		
//    		dto =new MaquneDTO();
//    		dto.setIdMaqune("7");
//    		dto.setNombre("nombre");
//    		dto.setIdSubmarca("1");
//    		dto.setDescripcion("xxxxxxdescripcion");
//    		dto.setnSerie("nnnserie");
//    		dto.setTipoAdq("R");
//    		dto.setFoto("mifoto");
//    		dto.setFechaAdq("2013-06-06");
//    		
//    		System.out.println("Resultado de update maqune: "+maquneService.updateMaqune(dto));
//    		dto.setFilterEstatusMaqune("");  
//    		dto.setIdMaqune("");
//    		dto.setIdSubmarca("");
//    		System.out.println("Resultado de maqune: "+maquneService.infoMaqune(dto).toString());
//    		
    		
    		//update estatus
    		
//    		dto =new MaquneDTO();
//    		dto.setIdMaqune("7");
//    		
//    		dto.setIdSubmarca("1");
//    		dto.setEstatus(false);
//    		
//    		System.out.println("Resultado de update maqune: "+maquneService.updateEstatusMaqune(dto));
//    		dto.setFilterEstatusMaqune("");  
//    		dto.setIdMaqune("");
//    		dto.setIdSubmarca("");
//    		System.out.println("Resultado de maqune: "+maquneService.infoMaqune(dto).toString());
//    		
    		
    		//delete
//    		dto =new MaquneDTO();
//    		dto.setIdMaqune("7");
//    		
//    		dto.setIdSubmarca("1");
//    		dto.setEstatus(false);
//    		
//    		System.out.println("Resultado de update maqune: "+maquneService.deleteMaqune(dto));
//    		dto.setFilterEstatusMaqune("");  
//    		dto.setIdMaqune("");
//    		dto.setIdSubmarca("");
//    		System.out.println("Resultado de maqune: "+maquneService.infoMaqune(dto).toString());
    		
    		
    		
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
	public MaquneService getMaquneService() {
		return maquneService;
	}
	public void setMaquneService(MaquneService maquneService) {
		this.maquneService = maquneService;
	}
	

}
