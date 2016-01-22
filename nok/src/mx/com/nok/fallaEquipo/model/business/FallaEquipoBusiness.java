package mx.com.nok.fallaEquipo.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.fallaEquipo.dao.FallaEquipoDAO;
import mx.com.nok.fallaEquipo.model.dto.FallaEquipoDTO;
import mx.com.nok.fallaEquipo.model.service.FallaEquipoService;

public class FallaEquipoBusiness implements Serializable, FallaEquipoService {

	private static final long serialVersionUID = 6737521961825967589L;
	private FallaEquipoDAO fallaEquipoDAO;
	
	@Override
	public List<FallaEquipoDTO> getFallasEquipo(FallaEquipoDTO dto) {
		List<FallaEquipoDTO> list = new ArrayList<FallaEquipoDTO>();
		try{
			list = fallaEquipoDAO.getFallasEquipo(dto);
		}catch(Exception e){
			e.printStackTrace();
			list = null;
		}
		return list;
	}

	@Override
	public FallaEquipoDTO insertFallaEquipo(FallaEquipoDTO dto) {
		try{
			return fallaEquipoDAO.insertFallaEquipo(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public FallaEquipoDTO updateFallaEquipo(FallaEquipoDTO dto) {
		try{
			return fallaEquipoDAO.updateFallaEquipo(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteFallaEquipo(FallaEquipoDTO dto) {
		try{
			return (Boolean)fallaEquipoDAO.deleteFallaEquipo(dto);
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public FallaEquipoDTO insertFallaEquipoComplement(FallaEquipoDTO dto) {
		try{
			return fallaEquipoDAO.insertFallaEquipoComplement(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public FallaEquipoDTO updateFallaEquipoComplement(FallaEquipoDTO dto) {
		try{
			return fallaEquipoDAO.updateFallaEquipoComplement(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public FallaEquipoDAO getFallaEquipoDAO() {
		return fallaEquipoDAO;
	}

	public void setFallaEquipoDAO(FallaEquipoDAO fallaEquipoDAO) {
		this.fallaEquipoDAO = fallaEquipoDAO;
	}

}
