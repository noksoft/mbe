package mx.com.nok.componente.model.service;

import java.util.List;


import mx.com.nok.componente.model.dto.ComponenteDTO;
import mx.com.nok.componente.model.dto.ComponentePerfilDTO;


public interface  ComponenteService {
	
	
	public List<?> catComponente(ComponenteDTO dto);
	public ComponenteDTO insertComponente(ComponenteDTO dto);
	public ComponenteDTO updateComponente(ComponenteDTO dto);
	public boolean deleteComponente(ComponenteDTO dto);
	public ComponenteDTO updateEstatusComponente(ComponenteDTO dto);	
	
	
	public List<?> infoComponentePerfil(ComponentePerfilDTO dto);
	public ComponentePerfilDTO insertComponentePerfil(ComponentePerfilDTO dto);
	public ComponentePerfilDTO updateComponentePerfil(ComponentePerfilDTO dto);
	public boolean deleteComponentePerfil(ComponentePerfilDTO dto);
	
	
	
	public List<?> catComponenteAopSession(ComponenteDTO dto);
	public ComponenteDTO insertComponenteAopSession(ComponenteDTO dto);
	public ComponenteDTO updateComponenteAopSession(ComponenteDTO dto);
	public boolean deleteComponenteAopSession(ComponenteDTO dto);
	public ComponenteDTO updateEstatusComponenteAopSession(ComponenteDTO dto);	
	
	
	public List<?> infoComponentePerfilAopSession(ComponentePerfilDTO dto);
	public ComponentePerfilDTO insertComponentePerfilAopSession(ComponentePerfilDTO dto);
	public ComponentePerfilDTO updateComponentePerfilAopSession(ComponentePerfilDTO dto);
	public boolean deleteComponentePerfilAopSession(ComponentePerfilDTO dto);
		

}
