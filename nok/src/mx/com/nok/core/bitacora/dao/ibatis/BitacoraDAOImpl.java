package mx.com.nok.core.bitacora.dao.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.core.bitacora.dao.BitacoraDAO;
import mx.com.nok.core.bitacora.model.dto.BitacoraDTO;

public class BitacoraDAOImpl extends  SqlMapClientDaoSupport implements BitacoraDAO{

	
	public void insertMovimiento(BitacoraDTO dto) throws Exception {
		
		this.getSqlMapClientTemplate().
		queryForObject("insertMovimiento",dto);
	}
	
	

}
