package mx.com.nok.componente.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.componente.dao.ComponenteDAO;
import mx.com.nok.componente.model.dto.ComponenteDTO;
import mx.com.nok.componente.model.dto.ComponentePerfilDTO;
import mx.com.nok.componente.model.service.ComponenteService;
import mx.com.nok.menu.model.dto.MenuDTO;

public class ComponenteBusiness implements Serializable, ComponenteService{

	
	private static final long serialVersionUID = 1L;
	ComponenteDAO componenteDAO;
	

	
	public List<?> infoComponentePerfil(ComponentePerfilDTO dto) {
		List <?> list= new ArrayList<ComponentePerfilDTO>();
		try {			
			list=componenteDAO.infoComponentePerfil(dto);	
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	
	public ComponentePerfilDTO insertComponentePerfil(ComponentePerfilDTO dto) {
		try {
			return (ComponentePerfilDTO)componenteDAO.insertComponentePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public ComponentePerfilDTO updateComponentePerfil(ComponentePerfilDTO dto) {
		try {
			
			return componenteDAO.updateComponentePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean deleteComponentePerfil(ComponentePerfilDTO dto) {
		try {
			return (Boolean)componenteDAO.deleteComponentePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	
	
	
	public List<?> catComponente(ComponenteDTO dto) {
		List <?> list= new ArrayList<ComponenteDTO>();
		try {			
			list=componenteDAO.infoComponente(dto);	
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public boolean deleteComponente(ComponenteDTO dto) {
		try {
			return (Boolean)componenteDAO.deleteComponente(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public ComponenteDTO insertComponente(ComponenteDTO dto) {
		try {
			return (ComponenteDTO)componenteDAO.insertComponente(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public ComponenteDTO updateComponente(ComponenteDTO dto) {
		try {
			
			return componenteDAO.updateComponente(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public ComponenteDTO updateEstatusComponente(ComponenteDTO dto) {
		try {
			
			return componenteDAO.updateEstatusComponente(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	
	
	
	
	public ComponenteDAO getComponenteDAO() {
		return componenteDAO;
	}

	public void setComponenteDAO(ComponenteDAO componenteDAO) {
		this.componenteDAO = componenteDAO;
	}
	
	
	//--------------------------------------------------------------------------------------------------
	
	
	
	public List<?> infoComponentePerfilAopSession(ComponentePerfilDTO dto) {
		List <?> list= new ArrayList<ComponentePerfilDTO>();
		try {			
			list=componenteDAO.infoComponentePerfil(dto);	
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	
	public ComponentePerfilDTO insertComponentePerfilAopSession(ComponentePerfilDTO dto) {
		try {
			return (ComponentePerfilDTO)componenteDAO.insertComponentePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public ComponentePerfilDTO updateComponentePerfilAopSession(ComponentePerfilDTO dto) {
		try {
			
			return componenteDAO.updateComponentePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean deleteComponentePerfilAopSession(ComponentePerfilDTO dto) {
		try {
			return (Boolean)componenteDAO.deleteComponentePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	
	
	
	public List<?> catComponenteAopSession(ComponenteDTO dto) {
		List <?> list= new ArrayList<ComponenteDTO>();
		try {			
			list=componenteDAO.infoComponente(dto);	
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public boolean deleteComponenteAopSession(ComponenteDTO dto) {
		try {
			return (Boolean)componenteDAO.deleteComponente(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public ComponenteDTO insertComponenteAopSession(ComponenteDTO dto) {
		try {
			return (ComponenteDTO)componenteDAO.insertComponente(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public ComponenteDTO updateComponenteAopSession(ComponenteDTO dto) {
		try {
			
			return componenteDAO.updateComponente(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public ComponenteDTO updateEstatusComponenteAopSession(ComponenteDTO dto) {
		try {
			
			return componenteDAO.updateEstatusComponente(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	

}
