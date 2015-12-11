package mx.com.nok.tipoempleado.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;
import mx.com.nok.tipoempleado.dao.TipoEmpleadoDAO;
import mx.com.nok.tipoempleado.model.service.TipoEmpleadoService;

public class TipoEmpleadoBusiness implements Serializable, TipoEmpleadoService {

	private static final long serialVersionUID = 1L;
	
	private TipoEmpleadoDAO tipoEmpleadoDAO;
	
	@Override
	public List<?> getTipoEmpleados(TipoEmpleadoDTO tipoEmpleadoDTO) {
		List <?> list= new ArrayList<TipoEmpleadoDTO>();
		try {			

			list = tipoEmpleadoDAO.getTipoEmpleado(tipoEmpleadoDTO);

		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}
	
	@Override
	public boolean deleteTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) {
		try{
			return tipoEmpleadoDAO.deleteTipoEmpleado(tipoEmpleadoDTO);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public TipoEmpleadoDTO insertTipoEmpleadoAopSession(
			TipoEmpleadoDTO tipoEmpleadoDTO) {
		try{
			return tipoEmpleadoDAO.insertTipoEmpleado(tipoEmpleadoDTO);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public TipoEmpleadoDTO updateTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) {
		try{
			return tipoEmpleadoDAO.updateTipoEmpleado(tipoEmpleadoDTO);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public TipoEmpleadoDTO updateEstatusProveedor(
			TipoEmpleadoDTO tipoEmpleadoDTO) {
		try{
			return tipoEmpleadoDAO.updateEstatusProveedor(tipoEmpleadoDTO);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public TipoEmpleadoDAO getTipoEmpleadoDAO() {
		return tipoEmpleadoDAO;
	}

	public void setTipoEmpleadoDAO(TipoEmpleadoDAO tipoEmpleadoDAO) {
		this.tipoEmpleadoDAO = tipoEmpleadoDAO;
	}

}
