package mx.com.nok.core.usuario.dao;

import java.util.List;

import mx.com.nok.core.usuario.model.dto.PerfilDTO;


public interface PerfilDAO {
	
	public List<?> infoPerfil(PerfilDTO dto) throws Exception;	
	public PerfilDTO insertPerfil(PerfilDTO dto)throws Exception;
	public PerfilDTO updatePerfil(PerfilDTO dto) throws Exception;
	public boolean deletePerfil(PerfilDTO dto) throws Exception;
	public PerfilDTO updateEstatusPerfil(PerfilDTO dto)throws Exception;

}
