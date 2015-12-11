package mx.com.nok.login.model.service;

import java.util.List;

import mx.com.nok.core.usuario.model.dto.PerfilDTO;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;

public interface LoginService {
	
	
	
	public UsuarioDTO logIn(UsuarioDTO dto);
	public boolean logOut();
	public UsuarioDTO infoUsuario();
	public UsuarioDTO updateUserAopSession (UsuarioDTO _user);
	public List<?> getInfoPerfilesAopSession(PerfilDTO _perfilDTO);
	public String saludoAopSession(String usuario);
}
