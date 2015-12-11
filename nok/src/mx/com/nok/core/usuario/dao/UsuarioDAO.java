package mx.com.nok.core.usuario.dao;

import java.util.List;

import mx.com.nok.core.usuario.model.dto.UsuarioDTO;



public interface UsuarioDAO {
	
	public List<?> infoUsuario(UsuarioDTO dto) throws Exception;	
	public UsuarioDTO insertUsuario(UsuarioDTO dto)throws Exception;
	public UsuarioDTO updateUsuario(UsuarioDTO dto) throws Exception;
	public boolean deleteUsuario(UsuarioDTO dto) throws Exception;
	public UsuarioDTO updateEstatusUsuario(UsuarioDTO dto)throws Exception;

}
