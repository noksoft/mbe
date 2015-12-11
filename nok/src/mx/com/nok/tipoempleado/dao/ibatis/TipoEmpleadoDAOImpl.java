package mx.com.nok.tipoempleado.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;
import mx.com.nok.proveedor.model.dto.ProveedorDTO;
import mx.com.nok.tipoempleado.dao.TipoEmpleadoDAO;

public class TipoEmpleadoDAOImpl extends SqlMapClientDaoSupport implements TipoEmpleadoDAO {

	@Override
	public List<?> getTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO)
			throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("getTipoEmpleados",tipoEmpleadoDTO);
	}

	@Override
	public TipoEmpleadoDTO insertTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception {
		return (TipoEmpleadoDTO)this.getSqlMapClientTemplate().
				queryForObject("insertTipoEmpleado",tipoEmpleadoDTO);
	}

	@Override
	public boolean deleteTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteTipoEmpleado",tipoEmpleadoDTO);
	}

	@Override
	public TipoEmpleadoDTO updateTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception {
		 return (TipoEmpleadoDTO)this.getSqlMapClientTemplate().
					queryForObject("updateTipoEmpleado",tipoEmpleadoDTO);
	}


	@Override
	public TipoEmpleadoDTO updateEstatusProveedor(TipoEmpleadoDTO tipoEmpleadoDTO)
			throws Exception {
		return (TipoEmpleadoDTO)this.getSqlMapClientTemplate().
				queryForObject("updateEstatusTipoEmpleado",tipoEmpleadoDTO);
	}

}
