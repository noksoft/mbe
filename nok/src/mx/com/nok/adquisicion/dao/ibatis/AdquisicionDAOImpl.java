package mx.com.nok.adquisicion.dao.ibatis;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.adquisicion.dao.IAdquisicionDAO;
import mx.com.nok.adquisicion.model.dto.AdquisicionDTO;

public class AdquisicionDAOImpl extends SqlMapClientDaoSupport implements IAdquisicionDAO, Serializable {

	private static final long serialVersionUID = -394752066499834862L;

	@SuppressWarnings("unchecked")
	@Override
	public List<AdquisicionDTO> getAdquisiciones(AdquisicionDTO adquisicion)
			throws Exception {
			return this.getSqlMapClientTemplate().queryForList("getAdquisiciones", adquisicion);
	}

	@Override
	public AdquisicionDTO insertAdquisicion(AdquisicionDTO adquisicion)
			throws Exception {
		return (AdquisicionDTO)this.getSqlMapClientTemplate().queryForObject("insertAdquisicion", adquisicion);
	}

	@Override
	public AdquisicionDTO updateAdquisicion(AdquisicionDTO adquisicion)
			throws Exception {
		return (AdquisicionDTO)this.getSqlMapClientTemplate().queryForObject("updateAdquisicion", adquisicion);
	}

	@Override
	public Boolean deleteAdquisicion(AdquisicionDTO adquisicion)
			throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().queryForObject("deleteAdquisicion", adquisicion);
	}

}
