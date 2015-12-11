package mx.com.nok.fallaEquipo.model.service;

import java.util.List;

import mx.com.nok.fallaEquipo.model.dto.FallaEquipoDTO;

public interface FallaEquipoService {
	
	public List<FallaEquipoDTO> getFallasEquipo(FallaEquipoDTO dto);
	public FallaEquipoDTO insertFallaEquipo(FallaEquipoDTO dto);
	public FallaEquipoDTO updateFallaEquipo(FallaEquipoDTO dto);
	public boolean deleteFallaEquipo(FallaEquipoDTO dto);

}
