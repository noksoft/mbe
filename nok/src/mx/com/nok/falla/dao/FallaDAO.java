package mx.com.nok.falla.dao;

import java.util.List;

import mx.com.nok.falla.model.dto.FallaDTO;
import mx.com.nok.falla.model.dto.SubfallaDTO;


public interface FallaDAO {
	
	
	public List<?> infoFalla(FallaDTO dto) throws Exception;
	public FallaDTO insertFalla(FallaDTO dto) throws Exception;
	public FallaDTO updateFalla(FallaDTO dto)throws Exception;
	public boolean deleteFalla(FallaDTO dto) throws Exception;
	public FallaDTO updateEstatusFalla(FallaDTO dto)throws Exception;
	
	public List<?> infoSubfalla(SubfallaDTO dto) throws Exception;
	public SubfallaDTO insertSubfalla(SubfallaDTO dto) throws Exception;
	public SubfallaDTO updateSubfalla(SubfallaDTO dto)throws Exception;
	public boolean deleteSubfalla(SubfallaDTO dto) throws Exception;
	public SubfallaDTO updateEstatusSubfalla(SubfallaDTO dto)throws Exception;

}
