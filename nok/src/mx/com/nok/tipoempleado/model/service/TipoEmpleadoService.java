package mx.com.nok.tipoempleado.model.service;

import java.util.List;

import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;

public interface TipoEmpleadoService {
	public TipoEmpleadoDTO insertTipoEmpleadoAopSession(TipoEmpleadoDTO tipoEmpleadoDTO);
	public boolean deleteTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO);
	public List<?> getTipoEmpleados(TipoEmpleadoDTO tipoEmpleadoDTO);
	public TipoEmpleadoDTO updateTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO);
	public TipoEmpleadoDTO updateEstatusProveedor(TipoEmpleadoDTO tipoEmpleadoDTO);
}
