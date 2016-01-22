package mx.com.nok.fallaEquipo.dao;

import java.util.List;

import mx.com.nok.fallaEquipo.model.dto.FallaEquipoDTO;

public interface FallaEquipoDAO {
	
	public List<FallaEquipoDTO> getFallasEquipo(FallaEquipoDTO dto)throws Exception;
	public FallaEquipoDTO insertFallaEquipo(FallaEquipoDTO dto)throws Exception;
	public FallaEquipoDTO updateFallaEquipo(FallaEquipoDTO dto)throws Exception;
	public boolean deleteFallaEquipo(FallaEquipoDTO dto)throws Exception;
	
	public FallaEquipoDTO insertFallaEquipoComplement(FallaEquipoDTO dto)throws Exception;
	public FallaEquipoDTO updateFallaEquipoComplement(FallaEquipoDTO dto)throws Exception;

}
