package mx.com.nok.fallaEquipo.dao.ibatis;

import java.util.List;

import mx.com.nok.fallaEquipo.dao.FallaEquipoDAO;
import mx.com.nok.fallaEquipo.model.dto.FallaEquipoDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class FallaEquipoDAOImpl extends SqlMapClientDaoSupport implements
		FallaEquipoDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<FallaEquipoDTO> getFallasEquipo(FallaEquipoDTO dto)
			throws Exception {
		return this.getSqlMapClientTemplate().queryForList("getFallaEquipo", dto);
	}

	@Override
	public FallaEquipoDTO insertFallaEquipo(FallaEquipoDTO dto)
			throws Exception {
		return (FallaEquipoDTO)this.getSqlMapClientTemplate().queryForObject("insertFallaEquipo",dto);
	}

	@Override
	public FallaEquipoDTO updateFallaEquipo(FallaEquipoDTO dto)
			throws Exception {
		return (FallaEquipoDTO)this.getSqlMapClientTemplate().queryForObject("updateFallaEquipo", dto);
	}

	@Override
	public boolean deleteFallaEquipo(FallaEquipoDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().queryForObject("deleteFallaEquipo", dto);
	}

}
