package mx.com.nok.obra.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.asignacion.model.dto.AsignacionDTO;
import mx.com.nok.empleado.model.dto.EmpleadoDTO;
import mx.com.nok.equipo.model.dto.EquipoDTO;
import mx.com.nok.obra.dao.ObraDAO;
import mx.com.nok.obra.model.dto.EmpleadoDisponibleDTO;
import mx.com.nok.obra.model.dto.EmpleadosAsignadosObraDTO;
import mx.com.nok.obra.model.dto.EquiposAsignadosObraDTO;
import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.obra.model.dto.ObraRecursoEquipoDTO;
import mx.com.nok.obra.model.dto.ObraRecursoMaquneDTO;
import mx.com.nok.obra.model.dto.ObraRecursoPersonaDTO;
import mx.com.nok.obra.model.service.ObraService;

public class ObraBusiness implements Serializable, ObraService{

	
	
	private ObraDAO obraDAO;
	private static final long serialVersionUID = 1L;
	
	public ObraDAO getObraDAO() {
		return obraDAO;
	}

	public void setObraDAO(ObraDAO obraDAO) {
		this.obraDAO = obraDAO;
	}
	
	public List<?> infoObra(ObraDTO dto) {
		List <?> list= new ArrayList<ObraDTO>();
		try {			
			
			list=obraDAO.infoObra(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	
	
	public ObraDTO insertObra(ObraDTO dto) {
		try {
			return obraDAO.insertObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public ObraDTO updateObra(ObraDTO dto) {
	try {
			
			return obraDAO.updateObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public boolean deleteObra(ObraDTO dto) {
		try {
			return (Boolean)obraDAO.deleteObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	public String getStatusEmpleado(EmpleadosAsignadosObraDTO empleado){
		String estatus = null;
		try{
			estatus = obraDAO.getEstausEmpleado(empleado);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return estatus;
	}

	
	public ObraRecursoEquipoDTO insertObraRecursoEquipo(ObraRecursoEquipoDTO dto) {
		try {
			return obraDAO.insertObraRecursoEquipo(dto);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ObraRecursoEquipoDTO updateObraRecursoEquipo(ObraRecursoEquipoDTO dto){
		try {
			//return obraDAO.upda
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
	
	public List<?> infoObraRecursoMaqune(ObraRecursoMaquneDTO dto) {
		List <?> list= new ArrayList<ObraRecursoMaquneDTO>();
		try {			
			list=obraDAO.infoObraRecursoMaqune(dto);	
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		return list;
	}
	
	public ObraRecursoMaquneDTO insertObraRecursoMaqune(ObraRecursoMaquneDTO dto) {
		try {
			return obraDAO.insertObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}



	
	public ObraRecursoMaquneDTO updateObraRecursoMaqune(ObraRecursoMaquneDTO dto) {
		try {
			return obraDAO.updateObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public boolean deleteObraRecursoMaqune(ObraRecursoMaquneDTO dto) {
		try {
			return (Boolean)obraDAO.deleteObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
//--------------------------------------------------------------

	
	
	public List<?> infoObraAopSession(ObraDTO dto) {
		List <?> list= new ArrayList<ObraDTO>();
		try {			
			
			list=obraDAO.infoObra(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	
	
	public ObraDTO insertObraAopSession(ObraDTO dto) {
		try {
			return obraDAO.insertObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public ObraDTO updateObraAopSession(ObraDTO dto) {
	try {
			
			return obraDAO.updateObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public boolean deleteObraAopSession(ObraDTO dto) {
		try {
			return (Boolean)obraDAO.deleteObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	
	public List<?> infoObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto) {
		List <?> list= new ArrayList<ObraRecursoMaquneDTO>();
		try {			
			
			list=obraDAO.infoObraRecursoMaqune(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}



	
	public ObraRecursoMaquneDTO insertObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto) {
		try {
			return obraDAO.insertObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}



	
	public ObraRecursoMaquneDTO updateObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto) {
		try {
			return obraDAO.updateObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public boolean deleteObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto) {
		try {
			return (Boolean)obraDAO.deleteObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<?> infoObraRecursoEquipo(ObraRecursoEquipoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteObraRecursoEquipo(ObraRecursoEquipoDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ObraRecursoPersonaDTO insertObraRecursoPersona(
			ObraRecursoPersonaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObraRecursoPersonaDTO updateObraRecursoPersona(
			ObraRecursoPersonaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> infoObraRecursoPersona(ObraRecursoPersonaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteObraRecursoEquipo(ObraRecursoPersonaDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public List<AsignacionDTO> infoAsignacionesDisponiblesObra(AsignacionDTO dto){
		List<AsignacionDTO> listAsignaciones = new ArrayList<AsignacionDTO>();
		try{
			listAsignaciones = obraDAO.infoAsigancionesDisponiblesObra(dto);
		}catch(Exception e){
			e.printStackTrace();
			listAsignaciones = null;
		}
		return listAsignaciones;
	}
	
	public List<EmpleadoDisponibleDTO> infoEmpleadoDisponible(EmpleadoDisponibleDTO dto){
		
		List<EmpleadoDisponibleDTO> list= new ArrayList<EmpleadoDisponibleDTO>();
		try {			
			
			list= obraDAO.infoEmpleadoDisponible(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	
	public List<EquiposAsignadosObraDTO> infoEquiposAsignadosObra( EquiposAsignadosObraDTO dto){
		List<EquiposAsignadosObraDTO> list = new ArrayList<EquiposAsignadosObraDTO>();
		try {
			list = obraDAO.infoEquiposAsignadosObra(dto);
		} catch (Exception e) {
			e.printStackTrace();
			 list=null;
		}
		return list;
	}
	
	public List<EmpleadosAsignadosObraDTO> infoEmpleadosAsignadosObra(EmpleadosAsignadosObraDTO dto){
		List<EmpleadosAsignadosObraDTO> list = new ArrayList<EmpleadosAsignadosObraDTO>();
		try {
			list = obraDAO.infoEmpleadosAsignadosObra(dto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			list = null;
		}
		return list;
	}

	@Override
	public boolean cambiaEstatusEmpleado(
			EmpleadosAsignadosObraDTO dto) {
		Boolean estatus;
		try {
			String estado = dto.getEstatus();
			System.out.println("LOG->"+estado);
			if(estado.equalsIgnoreCase("A")){
				estado = "I";
			}else{
				estado = "A";
			}
			System.out.println("LOG->"+estado);
			dto.setEstatus(estado);
			System.out.println("LOG->dto "+ dto.getEstatus());
			estatus = obraDAO.cambiaEstatusEmpleado(dto);
			
			System.out.println("LOG->"+estatus);
		} catch (Exception e) {
			estatus = false;
		}
		
		return estatus;
		
	}
	public boolean cambiaEstatusEquipo(EquiposAsignadosObraDTO dto){
		boolean estatus;
		try {
			/*String estado = dto.getEstatus();
			if(estado.equalsIgnoreCase("ASIGNADO")){
				estado = "INACTIVO";
			}else{
				estado = "ASIGNADO";
			}
			dto.setEstatus(estado);*/
			estatus = obraDAO.cambiaEstatusEquipo(dto);
		} catch (Exception e) {
			// TODO: handle exception
			estatus = false;
		}
		return estatus;
	}
	public boolean addEquipo(EquiposAsignadosObraDTO dto){
		boolean estatus;
		try {
			estatus = obraDAO.addEquipo(dto);
		} catch (Exception e) {
			estatus = false;
		}
		
		return estatus;
	}
	
	public boolean addEmpleado(EmpleadosAsignadosObraDTO dto){
		boolean estatus;
		try {
			estatus = obraDAO.addEmpleado(dto);
		} catch (Exception e) {
			estatus = false;
		}
		return estatus;
	}
	
	public List<EquipoDTO> getEquiposQueUsaElEmpleado(EmpleadoDTO dto){
		List<EquipoDTO> list  = new ArrayList<EquipoDTO>();
		try {
			list = obraDAO.getEmpleadoConMaquinaria(dto);
			
		} catch (Exception e) {
			e.printStackTrace();
			list = null;
		}
		return list;
	}

	@Override
	public AsignacionDTO insertAsignacionObra(AsignacionDTO dto) {
		try{
			return obraDAO.insertAsignacionObra(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public AsignacionDTO updateAsignacionObra(AsignacionDTO dto) {
		try{
			return obraDAO.updateAsignacionObra(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteAsignacionObra(AsignacionDTO dto) {
		try{
			return obraDAO.deleteAsignacionObra(dto);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	


	
}
