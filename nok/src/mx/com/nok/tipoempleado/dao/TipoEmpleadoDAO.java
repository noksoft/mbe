package mx.com.nok.tipoempleado.dao;

import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;

import java.util.List;

public interface TipoEmpleadoDAO {
	public List<?> getTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception;
	public TipoEmpleadoDTO insertTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception;
	public boolean deleteTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception;
	public TipoEmpleadoDTO updateTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception;
	public TipoEmpleadoDTO updateEstatusProveedor(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception;
}
