package mx.com.nok.falla.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.falla.dao.FallaDAO;
import mx.com.nok.falla.model.dto.FallaDTO;
import mx.com.nok.falla.model.dto.SubfallaDTO;
import mx.com.nok.falla.model.service.FallaService;


public class FallaBusiness implements Serializable, FallaService {

private FallaDAO fallaDAO;
private static final long serialVersionUID = 1L;
	
	public List<?> catFalla(FallaDTO dto) {
		List <?> list= new ArrayList<FallaDTO>();
		try {			
			
			list=fallaDAO.infoFalla(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public boolean deleteFalla(FallaDTO dto) {
		try {
			return (Boolean)fallaDAO.deleteFalla(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public FallaDTO insertFalla(FallaDTO dto) {
		try {
			return fallaDAO.insertFalla(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public FallaDTO updateEstatusFalla(FallaDTO dto) {
	try {
			
			return fallaDAO.updateEstatusFalla(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public FallaDTO updateFalla(FallaDTO dto) {
		try {
			
			return fallaDAO.updateFalla(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	public List<?> catSubfalla(SubfallaDTO dto) {
		List <?> list= new ArrayList<SubfallaDTO>();
		try {			
			
			list=fallaDAO.infoSubfalla(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}


	@Override
	public SubfallaDTO insertSubfalla(SubfallaDTO dto) {
		try {
			return fallaDAO.insertSubfalla(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}


	@Override
	public SubfallaDTO updateSubfalla(SubfallaDTO dto) {
	try {
				
				return fallaDAO.updateSubfalla(dto);
			} catch (Exception e) {			
				e.printStackTrace();
				return null;
			}
	}


	@Override
	public boolean deleteSubfalla(SubfallaDTO dto) {
		try {
			return (Boolean)fallaDAO.deleteSubfalla(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public SubfallaDTO updateEstatusSubfalla(SubfallaDTO dto) {
		try {
			
			return fallaDAO.updateEstatusSubfalla(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	public FallaDAO getFallaDAO() {
		return fallaDAO;
	}

	public void setFallaDAO(FallaDAO fallaDAO) {
		this.fallaDAO = fallaDAO;
	}


//--------------------------------------------------------------------------
	
	
	public List<?> catFallaAopSession(FallaDTO dto) {
		List <?> list= new ArrayList<FallaDTO>();
		try {			
			
			list=fallaDAO.infoFalla(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

}
