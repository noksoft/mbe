package mx.com.nok.direccion.dao.ibatis;

import java.util.List;

import mx.com.nok.direccion.dao.DireccionDAO;
import mx.com.nok.direccion.model.dto.EntidadDTO;
import mx.com.nok.direccion.model.dto.LocalidadDTO;
import mx.com.nok.direccion.model.dto.MunicipioDTO;
import mx.com.nok.flete.model.dto.FleteDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class DireccionDAOImpl extends SqlMapClientDaoSupport implements DireccionDAO{

		
	public List<?> catEntidad(EntidadDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoEntidad",dto);
	}

	
	public List<?> catLocalidad(LocalidadDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoLocalidad",dto);
	}

	
	public List<?> catMunicipio(MunicipioDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoMunicipio",dto);
	}

	
	public boolean deleteEntidad(EntidadDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteEntidad",dto);
	}

	
	public boolean deleteLocalidad(LocalidadDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteLocalidad",dto);
	}

	
	public boolean deleteMunicipio(MunicipioDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteMunicipio",dto);
	}

	
	public EntidadDTO insertEntidad(EntidadDTO dto) throws Exception {
		return (EntidadDTO)this.getSqlMapClientTemplate().
		queryForObject("insertEntidad",dto);
	}

	
	public LocalidadDTO insertLocalidad(LocalidadDTO dto) throws Exception {
		return (LocalidadDTO)this.getSqlMapClientTemplate().
		queryForObject("insertLocalidad",dto);
	}

	
	public MunicipioDTO insertMunicipio(MunicipioDTO dto) throws Exception {
		return (MunicipioDTO)this.getSqlMapClientTemplate().
		queryForObject("insertMunicipio",dto);
	}

	
	public EntidadDTO updateEntidad(EntidadDTO dto) throws Exception {
		return (EntidadDTO)this.getSqlMapClientTemplate().
		queryForObject("updateEntidad",dto);
	}

	
	public LocalidadDTO updateLocalidad(LocalidadDTO dto) throws Exception {
		return (LocalidadDTO)this.getSqlMapClientTemplate().
		queryForObject("updateLocalidad",dto);
	}

	
	public MunicipioDTO updateMunicipio(MunicipioDTO dto) throws Exception {
		return (MunicipioDTO)this.getSqlMapClientTemplate().
		queryForObject("updateMunicipio",dto);
	}

}
