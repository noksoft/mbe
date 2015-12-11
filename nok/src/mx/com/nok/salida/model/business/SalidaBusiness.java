package mx.com.nok.salida.model.business;

import java.util.ArrayList;
import java.util.List;

import mx.com.nok.maqune.dao.MaquneDAO;
import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.salida.dao.SalidaDAO;
import mx.com.nok.salida.model.dto.SalidaAlmacenDTO;

import mx.com.nok.salida.model.service.SalidaService;

public class SalidaBusiness  implements  SalidaService{

	private SalidaDAO salidaDAO;
	
	
	public List<?> infoSalidaAlmacen(SalidaAlmacenDTO dto) {
		List <?> list= new ArrayList<SalidaAlmacenDTO>();
		try {			
			
			list=salidaDAO.infoSalidaAlmacen(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	public SalidaAlmacenDTO insertSalidaAlmacen(SalidaAlmacenDTO dto) {
		try {
			return salidaDAO.insertSalidaAlmacen(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public SalidaAlmacenDTO updateSalidaAlmacen(SalidaAlmacenDTO dto) {
		try {
			return salidaDAO.updateSalidaAlmacen(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	
	public boolean deleteSalidaAlmacen(SalidaAlmacenDTO dto) {
		try {
			return (Boolean)salidaDAO.deleteSalidaAlmacen(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	


	public SalidaDAO getSalidaDAO() {
		return salidaDAO;
	}

	public void setSalidaDAO(SalidaDAO salidaDAO) {
		this.salidaDAO = salidaDAO;
	}

	
	public List<?> infoSalidaAlmacenAopSession(SalidaAlmacenDTO dto) {
		List <?> list= new ArrayList<SalidaAlmacenDTO>();
		try {			
			
			list=salidaDAO.infoSalidaAlmacen(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	public SalidaAlmacenDTO insertSalidaAlmacenAopSession(SalidaAlmacenDTO dto) {
		try {
			return salidaDAO.insertSalidaAlmacen(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public SalidaAlmacenDTO updateSalidaAlmacenAopSession(SalidaAlmacenDTO dto) {
		try {
			return salidaDAO.updateSalidaAlmacen(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	
	public boolean deleteSalidaAlmacenAopSession(SalidaAlmacenDTO dto) {
		try {
			return (Boolean)salidaDAO.deleteSalidaAlmacen(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	


}
