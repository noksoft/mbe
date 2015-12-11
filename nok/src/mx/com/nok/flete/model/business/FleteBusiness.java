package mx.com.nok.flete.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.falla.model.dto.FallaDTO;
import mx.com.nok.flete.dao.FleteDAO;
import mx.com.nok.flete.model.dto.FleteDTO;
import mx.com.nok.flete.model.service.FleteService;


public class FleteBusiness  implements Serializable, FleteService {

	
	
	
	private FleteDAO fleteDAO;
	private static final long serialVersionUID = 1L;
	
	public List<?> infoFlete(FleteDTO dto) {
		List <?> list= new ArrayList<FallaDTO>();
		try {			
			
			list=fleteDAO.infoFlete(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	
	public FleteDTO insertFlete(FleteDTO dto) {
		try {
			return fleteDAO.insertFlete(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public FleteDTO updateFlete(FleteDTO dto) {
		try {
			return fleteDAO.updateFlete(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	public boolean deleteFlete(FleteDTO dto) {
		
		try {
			return (Boolean)fleteDAO.deleteFlete(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	public FleteDAO getFleteDAO() {
		return fleteDAO;
	}

	public void setFleteDAO(FleteDAO fleteDAO) {
		this.fleteDAO = fleteDAO;
	}

	//------------------------------------------------------------------------
	
	
	

	public List<?> infoFleteAopSession(FleteDTO dto) {
		List <?> list= new ArrayList<FallaDTO>();
		try {			
			
			list=fleteDAO.infoFlete(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	
	public FleteDTO insertFleteAopSession(FleteDTO dto) {
		try {
			return fleteDAO.insertFlete(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public FleteDTO updateFleteAopSession(FleteDTO dto) {
		try {
			return fleteDAO.updateFlete(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	public boolean deleteFleteAopSession(FleteDTO dto) {
		
		try {
			return (Boolean)fleteDAO.deleteFlete(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}




}
