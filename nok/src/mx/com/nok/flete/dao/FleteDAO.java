package mx.com.nok.flete.dao;

import java.util.List;

import mx.com.nok.flete.model.dto.FleteDTO;


public interface FleteDAO {
	
	public List<?> infoFlete(FleteDTO dto) throws Exception;
	public FleteDTO insertFlete(FleteDTO dto)throws Exception;
	public FleteDTO updateFlete(FleteDTO dto) throws Exception;	
	public boolean deleteFlete(FleteDTO dto) throws Exception;

}
