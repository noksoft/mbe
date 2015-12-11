package mx.com.nok.core.usuario.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.core.usuario.dao.PerfilDAO;
import mx.com.nok.core.usuario.model.dto.PerfilDTO;


public class PerfilDAOImpl  extends SqlMapClientDaoSupport  implements PerfilDAO {
	
	@Override
	public boolean deletePerfil(PerfilDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deletePerfil",dto);
	}

	@Override
	public List<?> infoPerfil(PerfilDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
		queryForList("infoPerfil",dto);
	}

	@Override
	public PerfilDTO insertPerfil(PerfilDTO dto) throws Exception {
		 return (PerfilDTO)this.getSqlMapClientTemplate().
			queryForObject("insertPerfil",dto);
	}

	@Override
	public PerfilDTO updatePerfil(PerfilDTO dto) throws Exception {
		 return (PerfilDTO)this.getSqlMapClientTemplate().
			queryForObject("updatePerfil",dto);
	}

	
	public PerfilDTO updateEstatusPerfil(PerfilDTO dto) throws Exception {
		 return (PerfilDTO)this.getSqlMapClientTemplate().
			queryForObject("updateEstatusPerfil",dto);
	}
	

}
