package mx.com.nok.componente.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.componente.dao.ComponenteDAO;
import mx.com.nok.componente.model.dto.ComponenteDTO;
import mx.com.nok.componente.model.dto.ComponentePerfilDTO;
import mx.com.nok.menu.model.dto.MenuDTO;

public class ComponenteDAOImpl extends SqlMapClientDaoSupport implements ComponenteDAO{

	
	
	
	
	
	public List<?> infoComponentePerfil(ComponentePerfilDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoComponentePerfil",dto);
	}

	
	public ComponentePerfilDTO insertComponentePerfil(ComponentePerfilDTO dto) throws Exception {
		return (ComponentePerfilDTO)this.getSqlMapClientTemplate().
		queryForObject("insertComponentePerfil",dto);
	}

	
	public ComponentePerfilDTO updateComponentePerfil(ComponentePerfilDTO dto) throws Exception {
		return (ComponentePerfilDTO)this.getSqlMapClientTemplate().
		queryForObject("updateComponentePerfil",dto);
	}

	public boolean deleteComponentePerfil(ComponentePerfilDTO dto) throws Exception {
		
		return (Boolean)this.getSqlMapClientTemplate().
			queryForObject("deleteComponentePerfil",dto);
	}

	
	

	
	public List<?> infoComponente(ComponenteDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoComponente",dto);
	}

	
	public ComponenteDTO insertComponente(ComponenteDTO dto) throws Exception {
		return (ComponenteDTO)this.getSqlMapClientTemplate().
		queryForObject("insertComponente",dto);
	}

	
	public ComponenteDTO updateComponente(ComponenteDTO dto) throws Exception {
		return (ComponenteDTO)this.getSqlMapClientTemplate().
		queryForObject("updateComponente",dto);
	}

	
	public ComponenteDTO updateEstatusComponente(ComponenteDTO dto)
			throws Exception {
		return (ComponenteDTO)this.getSqlMapClientTemplate().
		queryForObject("updateEstatusComponente",dto);
	}
	
	public boolean deleteComponente(ComponenteDTO dto) throws Exception {
		
		return (Boolean)this.getSqlMapClientTemplate().
			queryForObject("deleteComponente",dto);
	}

	

}
