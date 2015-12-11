package mx.com.nok.core.usuario.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.core.usuario.dao.UsuarioDAO;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;

public class UsuarioDAOImpl extends SqlMapClientDaoSupport implements UsuarioDAO {

	
	
	@Override
	public boolean deleteUsuario(UsuarioDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteUsuario",dto);
	}

	@Override
	public List<?> infoUsuario(UsuarioDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
		queryForList("infoUsuario",dto);
	}

	@Override
	public UsuarioDTO insertUsuario(UsuarioDTO dto) throws Exception {
		 return (UsuarioDTO)this.getSqlMapClientTemplate().
			queryForObject("insertUsuario",dto);
	}

	@Override
	public UsuarioDTO updateUsuario(UsuarioDTO dto) throws Exception {
		 return (UsuarioDTO)this.getSqlMapClientTemplate().
			queryForObject("updateUsuario",dto);
	}

	
	public UsuarioDTO updateEstatusUsuario(UsuarioDTO dto) throws Exception {
		 return (UsuarioDTO)this.getSqlMapClientTemplate().
			queryForObject("updateEstatusUsuario",dto);
	}
}
