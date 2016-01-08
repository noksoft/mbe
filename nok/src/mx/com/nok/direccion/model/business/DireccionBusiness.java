package mx.com.nok.direccion.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.direccion.dao.DireccionDAO;
import mx.com.nok.direccion.model.dto.EntidadDTO;
import mx.com.nok.direccion.model.dto.LocalidadDTO;
import mx.com.nok.direccion.model.dto.MunicipioDTO;
import mx.com.nok.direccion.model.service.DireccionService;
import mx.com.nok.falla.model.dto.FallaDTO;

public class DireccionBusiness implements Serializable, DireccionService{

	private DireccionDAO direccionDAO;
	private static final long serialVersionUID = 1L;
	
	public List<?> catEntidad(EntidadDTO dto) {
					
	List <?> list= new ArrayList<FallaDTO>();
	try {				
			list=direccionDAO.catEntidad(dto);	
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public List<?> catLocalidad(LocalidadDTO dto) {
		List <?> list= new ArrayList<FallaDTO>();
		try {				
				list=direccionDAO.catLocalidad(dto);	
				
				 
			} catch (Exception e) {			
				e.printStackTrace();
				 list=null;
			}
			
			return list;
	}

	
	public List<?> catMunicipio(MunicipioDTO dto) {
		List <?> list= new ArrayList<FallaDTO>();
		try {				
				list=direccionDAO.catMunicipio(dto);	
				
				 
			} catch (Exception e) {			
				e.printStackTrace();
				 list=null;
			}
			
			return list;
	}

	
	public boolean deleteEntidad(EntidadDTO dto) {
		try {
			return (Boolean)direccionDAO.deleteEntidad(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean deleteLocalidad(LocalidadDTO dto) {
		try {
			return (Boolean)direccionDAO.deleteLocalidad(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean deleteMunicipio(MunicipioDTO dto) {
		try {
			return (Boolean)direccionDAO.deleteMunicipio(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public EntidadDTO insertEntidad(EntidadDTO dto) {
		try {
			return direccionDAO.insertEntidad(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public LocalidadDTO insertLocalidad(LocalidadDTO dto) {
		try {
			return direccionDAO.insertLocalidad(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public MunicipioDTO insertMunicipio(MunicipioDTO dto) {
		try {
			return direccionDAO.insertMunicipio(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public EntidadDTO updateEntidad(EntidadDTO dto) {
		try {
			return direccionDAO.updateEntidad(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public LocalidadDTO updateLocalidad(LocalidadDTO dto) {
		try {
			return direccionDAO.updateLocalidad(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public MunicipioDTO updateMunicipio(MunicipioDTO dto) {
		try {
			return direccionDAO.updateMunicipio(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	public DireccionDAO getDireccionDAO() {
		return direccionDAO;
	}


	public void setDireccionDAO(DireccionDAO direccionDAO) {
		this.direccionDAO = direccionDAO;
	}
}

