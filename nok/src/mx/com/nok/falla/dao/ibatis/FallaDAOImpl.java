package mx.com.nok.falla.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.falla.dao.FallaDAO;
import mx.com.nok.falla.model.dto.FallaDTO;
import mx.com.nok.falla.model.dto.SubfallaDTO;


public class FallaDAOImpl  extends SqlMapClientDaoSupport implements FallaDAO{

	@Override
	public boolean deleteFalla(FallaDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteFalla",dto);
	}

	@Override
	public List<?> infoFalla(FallaDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoFalla",dto);
	}

	@Override
	public FallaDTO insertFalla(FallaDTO dto) throws Exception {
		return (FallaDTO)this.getSqlMapClientTemplate().
		queryForObject("insertFalla",dto);
	}

	@Override
	public FallaDTO updateEstatusFalla(FallaDTO dto) throws Exception {
		return (FallaDTO)this.getSqlMapClientTemplate().
		queryForObject("updateEstatusFalla",dto);
	}

	@Override
	public FallaDTO updateFalla(FallaDTO dto) throws Exception {
		return (FallaDTO)this.getSqlMapClientTemplate().
		queryForObject("updateFalla",dto);
	}

	@Override
	public List<?> infoSubfalla(SubfallaDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("infoSubfalla",dto);
	}

	@Override
	public SubfallaDTO insertSubfalla(SubfallaDTO dto) throws Exception {
		return (SubfallaDTO)this.getSqlMapClientTemplate().
				queryForObject("insertSubfalla",dto);
	}

	@Override
	public SubfallaDTO updateSubfalla(SubfallaDTO dto) throws Exception {
		return (SubfallaDTO)this.getSqlMapClientTemplate().
				queryForObject("updateSubfalla",dto);
	}

	@Override
	public boolean deleteSubfalla(SubfallaDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteSubfalla",dto);
	}

	@Override
	public SubfallaDTO updateEstatusSubfalla(SubfallaDTO dto) throws Exception {
		return (SubfallaDTO)this.getSqlMapClientTemplate().
				queryForObject("updateEstatusSubfalla",dto);
	}
	
	
	

}
