package mx.com.nok.login.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.core.usuario.model.dto.PerfilDTO;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.login.dao.LoginDAO;

public class LoginDAOImpl extends SqlMapClientDaoSupport implements LoginDAO {

	

	public Boolean logUsr(UsuarioDTO dto) {		
		System.out.println(dto);
		System.out.println("");
		return (Boolean)this.getSqlMapClientTemplate().queryForObject("log_in_out", dto);
	}
	public UsuarioDTO getInfoUsuario(UsuarioDTO dto) {		
		return (UsuarioDTO)this.getSqlMapClientTemplate().queryForObject("getInfoUsuario", dto);
	}

	/**
	 * Función que permite guardar el nuevo pasword
	 */
	public UsuarioDTO updateUser(UsuarioDTO _user){
		return (UsuarioDTO)this.getSqlMapClientTemplate().queryForObject("updateUsuario", _user);
	}
	
	/**
	 * Función que regresa los perfiles
	 */
	public List<?> getPerfiles(PerfilDTO _perfilDTO){
		return this.getSqlMapClientTemplate().queryForList("infoPerfil", _perfilDTO);
	}

}
