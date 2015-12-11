package mx.com.nok.resguardo.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.articulo.model.dto.ArticuloDTO;
import mx.com.nok.resguardo.dao.ResguardoDAO;
import mx.com.nok.resguardo.model.dto.ResguardoDTO;
import mx.com.nok.resguardo.model.service.ResguardoService;

public class ResguardoBusiness implements Serializable,ResguardoService{

	
	private static final long serialVersionUID = 1L;
	private ResguardoDAO resguardoDAO;

	@Override
	public ResguardoDTO devolucionResguardoAopSession(ResguardoDTO dto) {
		try {
			return (ResguardoDTO)resguardoDAO.devolucionResguardo(dto);
		} catch (Exception e) {		
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<?> getInfoResguardoAopSession(ResguardoDTO dto) {
		List <?> list= new ArrayList<ResguardoDTO>();
		try {			
			
			list=resguardoDAO.getInfoResguardo(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	@Override
	public ResguardoDTO insertResguardoAopSession(ResguardoDTO dto) {
		try {
			return (ResguardoDTO)resguardoDAO.insertResguardo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}				
	}


	@Override
	public List<?> getArticuloSinResguardoAopSession() {
		List <?> list= new ArrayList<ArticuloDTO>();
		try {			
			
			list=resguardoDAO.getArticuloSinResguardo();	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	public ResguardoDAO getResguardoDAO() {
		return resguardoDAO;
	}

	public void setResguardoDAO(ResguardoDAO resguardoDAO) {
		this.resguardoDAO = resguardoDAO;
	}

	
	
}
