package mx.com.nok.empleado.dao;

import java.util.List;

import mx.com.nok.empleado.model.dto.EmpleadoDTO;
import mx.com.nok.empleado.model.dto.HabilidadDTO;
//import mx.com.nok.empleado.model.dto.HabilidadDTO;
import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;


public interface EmpleadoDAO {
	
	public List<?> infoEmpleado(EmpleadoDTO dto) throws Exception;	
	public EmpleadoDTO insertEmpleado(EmpleadoDTO dto)throws Exception;
	public EmpleadoDTO updateEmpleado(EmpleadoDTO dto) throws Exception;
	public boolean deleteEmpleado(EmpleadoDTO dto) throws Exception;
	public EmpleadoDTO updateEstatusEmpleado(EmpleadoDTO dto)throws Exception;
	
	public List<?> infoTipoEmpleado(TipoEmpleadoDTO dto) throws Exception;
	public TipoEmpleadoDTO insertTipoEmpleado(TipoEmpleadoDTO dto) throws Exception;
	public TipoEmpleadoDTO updateTipoEmpleado(TipoEmpleadoDTO dto)throws Exception;
	public boolean deleteTipoEmpleado(TipoEmpleadoDTO dto) throws Exception;
	public TipoEmpleadoDTO updateEstatusTipoEmpleado(TipoEmpleadoDTO dto)throws Exception;
	
	public List<?> infoHabilidad(HabilidadDTO dto) throws Exception;
	public HabilidadDTO insertHabilidad(HabilidadDTO dto) throws Exception;
	public HabilidadDTO updateHabilidad(HabilidadDTO dto)throws Exception;
	public boolean deleteHabilidad(HabilidadDTO dto) throws Exception;
	public HabilidadDTO updateEstatusHabilidad(HabilidadDTO dto)throws Exception;
	
}
