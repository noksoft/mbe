package mx.com.nok.salida.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.salida.dao.SalidaDAO;
import mx.com.nok.salida.model.dto.SalidaAlmacenDTO;


public class SalidaDAOImpl extends SqlMapClientDaoSupport implements  SalidaDAO {

	
	
	public List<?> infoSalidaAlmacen(SalidaAlmacenDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoSalidaAlmacen",dto);
	}
	
	public SalidaAlmacenDTO insertSalidaAlmacen(SalidaAlmacenDTO dto) throws Exception {
		return (SalidaAlmacenDTO)this.getSqlMapClientTemplate().
		queryForObject("insertSalidaAlmacen",dto);
	}

	
	public SalidaAlmacenDTO updateSalidaAlmacen(SalidaAlmacenDTO dto) throws Exception {
		return (SalidaAlmacenDTO)this.getSqlMapClientTemplate().
		queryForObject("updateSalidaAlmacen",dto);
	}



	
	public boolean deleteSalidaAlmacen(SalidaAlmacenDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteSalidaAlmacen",dto);
	}


}
