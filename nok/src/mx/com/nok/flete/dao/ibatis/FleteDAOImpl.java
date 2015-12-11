package mx.com.nok.flete.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.flete.dao.FleteDAO;
import mx.com.nok.flete.model.dto.FleteDTO;


public class FleteDAOImpl extends SqlMapClientDaoSupport implements  FleteDAO {

	
	
	public List<?> infoFlete(FleteDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("infoFlete",dto);
	}
	
	public FleteDTO insertFlete(FleteDTO dto) throws Exception {
		return (FleteDTO)this.getSqlMapClientTemplate().
				queryForObject("insertFlete",dto);
	}

	
	public FleteDTO updateFlete(FleteDTO dto) throws Exception {
		return (FleteDTO)this.getSqlMapClientTemplate().
				queryForObject("updateFlete",dto);
	}	

	
	public boolean deleteFlete(FleteDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteFlete",dto);
	}

}
