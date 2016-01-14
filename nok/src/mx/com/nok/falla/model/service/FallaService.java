package mx.com.nok.falla.model.service;

import java.util.List;

import mx.com.nok.falla.model.dto.FallaDTO;
import mx.com.nok.falla.model.dto.SubfallaDTO;


public interface FallaService {

	
	public List<?> catFalla(FallaDTO dto);
	public FallaDTO insertFalla(FallaDTO dto);
	public FallaDTO updateFalla(FallaDTO dto);
	public boolean deleteFalla(FallaDTO dto);
	public FallaDTO updateEstatusFalla(FallaDTO dto);	
	

	public List<?> catSubfalla(SubfallaDTO dto);
	public SubfallaDTO insertSubfalla(SubfallaDTO dto);
	public SubfallaDTO updateSubfalla(SubfallaDTO dto);
	public boolean deleteSubfalla(SubfallaDTO dto);
	public SubfallaDTO updateEstatusSubfalla(SubfallaDTO dto);	
	
}
