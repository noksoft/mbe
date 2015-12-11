package mx.com.nok.obra.dao;

import java.util.List;

import mx.com.nok.asignacion.model.dto.AsignacionDTO;
import mx.com.nok.empleado.model.dto.EmpleadoDTO;
import mx.com.nok.equipo.model.dto.EquipoDTO;
import mx.com.nok.obra.model.dto.EmpleadoDisponibleDTO;
import mx.com.nok.obra.model.dto.EmpleadosAsignadosObraDTO;
import mx.com.nok.obra.model.dto.EquiposAsignadosObraDTO;
import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.obra.model.dto.ObraRecursoEquipoDTO;
import mx.com.nok.obra.model.dto.ObraRecursoMaquneDTO;
import mx.com.nok.obra.model.dto.ObraRecursoPersonaDTO;

public interface ObraDAO {
	
	public ObraDTO insertObra(ObraDTO dto)throws Exception;
	public ObraDTO updateObra(ObraDTO dto) throws Exception;
	public List<?> infoObra(ObraDTO dto) throws Exception;
	public boolean deleteObra(ObraDTO dto) throws Exception;
		
	
	public ObraRecursoMaquneDTO insertObraRecursoMaqune(ObraRecursoMaquneDTO dto)throws Exception;
	public ObraRecursoMaquneDTO updateObraRecursoMaqune(ObraRecursoMaquneDTO dto)throws Exception;
	public List<?> infoObraRecursoMaqune(ObraRecursoMaquneDTO dto)throws Exception;
	public boolean deleteObraRecursoMaqune(ObraRecursoMaquneDTO dto)throws Exception;
	
	public ObraRecursoEquipoDTO insertObraRecursoEquipo(ObraRecursoEquipoDTO dto)throws Exception;
	public ObraRecursoEquipoDTO updateObraRecursoEquipo(ObraRecursoEquipoDTO dto)throws Exception;
	public List<?> infoObraRecursoEquipo(ObraRecursoEquipoDTO dto)throws Exception;
	public boolean deleteObraRecursoEquipo(ObraRecursoEquipoDTO dto)throws Exception;
	
	public ObraRecursoPersonaDTO insertObraRecursoPersona(ObraRecursoPersonaDTO dto)throws Exception;
	public ObraRecursoPersonaDTO updateObraRecursoPersona(ObraRecursoPersonaDTO dto)throws Exception;
	public List<?> infoObraRecursoPersona(ObraRecursoPersonaDTO dto)throws Exception;
	public boolean deleteObraRecursoEquipo(ObraRecursoPersonaDTO dto)throws Exception;
	
	public List<AsignacionDTO> infoAsigancionesDisponiblesObra(AsignacionDTO dto) throws Exception;
	
	public AsignacionDTO insertAsignacionObra(AsignacionDTO dto) throws Exception;
	public AsignacionDTO updateAsignacionObra(AsignacionDTO dto) throws Exception;
	public Boolean deleteAsignacionObra(AsignacionDTO dto) throws Exception;
	
	public List<EmpleadoDisponibleDTO> infoEmpleadoDisponible(EmpleadoDisponibleDTO dto) throws Exception;
	public List<EquiposAsignadosObraDTO> infoEquiposAsignadosObra(EquiposAsignadosObraDTO dto)throws Exception;
	
	
	public List<EmpleadosAsignadosObraDTO> infoEmpleadosAsignadosObra(EmpleadosAsignadosObraDTO dto) throws Exception;
	
	public boolean cambiaEstatusEmpleado(EmpleadosAsignadosObraDTO dto) throws Exception;
	
	public boolean cambiaEstatusEquipo(EquiposAsignadosObraDTO dto) throws Exception;
	
	public boolean addEquipo(EquiposAsignadosObraDTO dto) throws Exception;
	
	public boolean addEmpleado(EmpleadosAsignadosObraDTO dto) throws Exception;
	
	public String getEstausEmpleado(EmpleadosAsignadosObraDTO dto) throws Exception;

	public List<EquipoDTO> getEmpleadoConMaquinaria(EmpleadoDTO dto) throws Exception;
	
	

}
