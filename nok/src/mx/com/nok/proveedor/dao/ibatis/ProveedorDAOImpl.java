package mx.com.nok.proveedor.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.menu.model.dto.MenuDTO;
import mx.com.nok.proveedor.dao.ProveedorDAO;
import mx.com.nok.proveedor.model.dto.ProveedorDTO;

public class ProveedorDAOImpl extends SqlMapClientDaoSupport implements ProveedorDAO {

	@Override
	public List<?> infoProveedor(ProveedorDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("infoProveedor",dto);
	}

	@Override
	public ProveedorDTO insertProveedor(ProveedorDTO dto) throws Exception {
		return (ProveedorDTO)this.getSqlMapClientTemplate().
				queryForObject("insertProveedor",dto);
	}

	@Override
	public ProveedorDTO updateProveedor(ProveedorDTO dto) throws Exception {
		 return (ProveedorDTO)this.getSqlMapClientTemplate().
					queryForObject("updateProveedor",dto);
	}

	@Override
	public boolean deleteProveedor(ProveedorDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteProveedor",dto);
	}

	@Override
	public ProveedorDTO updateEstatusProveedor(ProveedorDTO dto)
			throws Exception {
		return (ProveedorDTO)this.getSqlMapClientTemplate().
				queryForObject("updateEstatusProveedor",dto);
	}

}
