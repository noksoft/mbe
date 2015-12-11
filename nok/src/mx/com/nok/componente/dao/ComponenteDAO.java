package mx.com.nok.componente.dao;

import java.util.List;

import mx.com.nok.componente.model.dto.ComponenteDTO;
import mx.com.nok.componente.model.dto.ComponentePerfilDTO;



public interface ComponenteDAO {
	

	public List<?> infoComponente(ComponenteDTO dto) throws Exception;
	public ComponenteDTO insertComponente(ComponenteDTO dto) throws Exception;
	public ComponenteDTO updateComponente(ComponenteDTO dto)throws Exception;
	public boolean deleteComponente(ComponenteDTO dto) throws Exception;
	public ComponenteDTO updateEstatusComponente(ComponenteDTO dto)throws Exception;
	
	public List<?> infoComponentePerfil(ComponentePerfilDTO dto) throws Exception;
	public ComponentePerfilDTO insertComponentePerfil(ComponentePerfilDTO dto) throws Exception;
	public ComponentePerfilDTO updateComponentePerfil(ComponentePerfilDTO dto)throws Exception;
	public boolean deleteComponentePerfil(ComponentePerfilDTO dto) throws Exception;

}
