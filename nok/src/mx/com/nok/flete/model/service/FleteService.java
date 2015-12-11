package mx.com.nok.flete.model.service;

import java.util.List;

import mx.com.nok.flete.model.dto.FleteDTO;
import mx.com.nok.obra.model.dto.ObraDTO;

public interface FleteService {
	
	public List<?> infoFlete(FleteDTO dto);
	public FleteDTO insertFlete(FleteDTO dto);
	public FleteDTO updateFlete(FleteDTO dto);	
	public boolean deleteFlete(FleteDTO dto);
	
	
	
	public List<?> infoFleteAopSession(FleteDTO dto);
	public FleteDTO insertFleteAopSession(FleteDTO dto);
	public FleteDTO updateFleteAopSession(FleteDTO dto);	
	public boolean deleteFleteAopSession(FleteDTO dto);

}
