package mx.com.nok.contrato.dao.ibatis;

import java.util.List;

import mx.com.nok.contrato.dao.ContratoDAO;
import mx.com.nok.contrato.model.dto.ContratoDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ContratoDAOImpl extends SqlMapClientDaoSupport implements
		ContratoDAO {

	@Override
	public List<?> infoContrato(ContratoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().queryForList("infoContrato", dto);
	}

	@Override
	public ContratoDTO insertContrato(ContratoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return (ContratoDTO)this.getSqlMapClientTemplate().queryForObject("insertContrato",dto);
	}

	@Override
	public ContratoDTO updateContrato(ContratoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return (ContratoDTO)this.getSqlMapClientTemplate().queryForObject("updateContrato",dto);
	}

	@Override
	public boolean deleteContrato(ContratoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return (Boolean)this.getSqlMapClientTemplate().queryForObject("deleteContrato", dto);
	}

	@Override
	public ContratoDTO updateEstatusContrato(ContratoDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return (ContratoDTO)this.getSqlMapClientTemplate().queryForObject("updateEstatusContrato",dto);
	}

}
