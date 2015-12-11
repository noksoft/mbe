package mx.com.nok.login.dao;

import java.util.List;

import mx.com.nok.core.usuario.model.dto.PerfilDTO;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;

public interface LoginDAO {	
	
	public Boolean logUsr(UsuarioDTO dto);
	public UsuarioDTO getInfoUsuario(UsuarioDTO dto);
	public UsuarioDTO updateUser (UsuarioDTO user);
	public List<?> getPerfiles(PerfilDTO _perfilDTO);
	
}
