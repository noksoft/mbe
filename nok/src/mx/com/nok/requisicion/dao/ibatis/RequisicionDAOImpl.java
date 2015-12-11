package mx.com.nok.requisicion.dao.ibatis;

import java.util.List;

import mx.com.nok.requisicion.dao.RequisicionDAO;
import mx.com.nok.requisicion.model.dto.RequisicionDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDetalleDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class RequisicionDAOImpl extends SqlMapClientDaoSupport implements RequisicionDAO {

	
	@SuppressWarnings("unchecked")
	public List<RequisicionDetalleDTO> infoRequisicionDetalle(RequisicionDetalleDTO dto) throws Exception {
		System.out.println("dto.getIdRequisicion(): " + dto.getIdRequisicion());
		List<RequisicionDetalleDTO> listResult = this.getSqlMapClientTemplate().
		queryForList("infoRequisicionDetalle",dto);
		System.out.println("listResult.size(): " + listResult.size());
		return listResult;
		
	}
	
	public RequisicionDetalleDTO insertRequisicionDetalle(RequisicionDetalleDTO dto)
			throws Exception {
		return (RequisicionDetalleDTO)this.getSqlMapClientTemplate().
		queryForObject("insertRequisicionDetalle",dto);
	}

	
	public RequisicionDetalleDTO updateRequisicionDetalle(RequisicionDetalleDTO dto)
			throws Exception {
		return (RequisicionDetalleDTO)this.getSqlMapClientTemplate().
		queryForObject("updateRequisicionDetalle",dto);
	}

	
	public boolean deleteRequisicionDetalle(RequisicionDetalleDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteRequisicionDetalle",dto);
	}
	
	@SuppressWarnings("unchecked")
	public List<RequisicionDTO> infoRequisicion(RequisicionDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoRequisicion",dto);
	}
	
	public RequisicionDTO insertRequisicion(RequisicionDTO dto)
			throws Exception {
		return (RequisicionDTO)this.getSqlMapClientTemplate().
		queryForObject("insertRequisicion",dto);
	}

	public RequisicionDTO insertRequisicionSinFalla(RequisicionDTO dto)throws Exception{
		return (RequisicionDTO)this.getSqlMapClientTemplate().
				queryForObject("insertRequisicionSinFalla", dto);
	}
	
	public RequisicionDTO updateRequisicion(RequisicionDTO dto)
			throws Exception {
		return (RequisicionDTO)this.getSqlMapClientTemplate().
		queryForObject("updateRequisicion",dto);
	}
	
	public RequisicionDTO updateRequisicionSinFalla(RequisicionDTO dto)
			throws Exception {
		return (RequisicionDTO)this.getSqlMapClientTemplate().
		queryForObject("updateRequisicionSinFalla",dto);
	}
	
	public boolean deleteRequisicion(RequisicionDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteRequisicion",dto);
	}
}
