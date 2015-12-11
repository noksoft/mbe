package mx.com.nok.resguardo.dao.ibatis;

import java.io.Serializable;
import java.util.List;

import mx.com.nok.articulo.model.dto.ArticuloDTO;
import mx.com.nok.resguardo.dao.ResguardoDAO;
import mx.com.nok.resguardo.model.dto.ResguardoDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ResguardoDAOImpl extends SqlMapClientDaoSupport implements Serializable, ResguardoDAO{

	@Override
	public ResguardoDTO devolucionResguardo(ResguardoDTO dto) {
		 return (ResguardoDTO)this.getSqlMapClientTemplate().
			queryForObject("devolucionResguardo",dto);
	}

	@Override
	public List<ResguardoDTO> getInfoResguardo(ResguardoDTO dto) {
		return this.getSqlMapClientTemplate().
		queryForList("infoResguardo",dto);	
	}
	@Override
	public ResguardoDTO insertResguardo(ResguardoDTO dto) {
		return (ResguardoDTO)this.getSqlMapClientTemplate().
		queryForObject("insertResguardo",dto);
	}
	
	@Override
	public List<ArticuloDTO>getArticuloSinResguardo() {
		return this.getSqlMapClientTemplate().
		queryForList("articuloSinResguardo");	
	}
}
