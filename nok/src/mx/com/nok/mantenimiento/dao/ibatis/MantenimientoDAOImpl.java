package mx.com.nok.mantenimiento.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.mantenimiento.dao.MantenimientoDAO;
import mx.com.nok.mantenimiento.model.dto.DetalleManttoDTO;
import mx.com.nok.mantenimiento.model.dto.ProgramaManttoDTO;
import mx.com.nok.obra.model.dto.ObraDTO;


public class MantenimientoDAOImpl  extends SqlMapClientDaoSupport implements MantenimientoDAO{

	public List<?> infoDetalleMantenimiento(DetalleManttoDTO dto){
		return this.getSqlMapClientTemplate().
		queryForList("infoDetalleMantenimiento",dto);
	}
	
	public DetalleManttoDTO insertDetalleMantenimiento(DetalleManttoDTO dto)
			throws Exception {
		return (DetalleManttoDTO)this.getSqlMapClientTemplate().
		queryForObject("insertDetalleMantenimiento",dto);
	}
	
	public DetalleManttoDTO updateDetalleMantenimiento(DetalleManttoDTO dto)
			throws Exception {
		
		return (DetalleManttoDTO)this.getSqlMapClientTemplate().
		queryForObject("updateDetalleMantenimiento",dto);
		
	}
	
	public boolean deleteDetalleMantenimiento(DetalleManttoDTO dto)
	throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteDetalleMantenimiento",dto);
}

	

	
	
	
	public List<?> infoProgramaMantenimiento(ProgramaManttoDTO dto)
	throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoProgramaMantenimiento",dto);
	}
	public ProgramaManttoDTO insertProgramaMantenimiento(ProgramaManttoDTO dto)
	throws Exception {
		return (ProgramaManttoDTO)this.getSqlMapClientTemplate().
		queryForObject("insertProgramaMantenimiento",dto);
	}

	public ProgramaManttoDTO updateProgramaMantenimiento(ProgramaManttoDTO dto)
			throws Exception {
		return (ProgramaManttoDTO)this.getSqlMapClientTemplate().
		queryForObject("updateProgramaMantenimiento",dto);
	}
	
	public boolean deleteProgramaMantenimiento(ProgramaManttoDTO dto)
	throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteProgramaMantenimiento",dto);
	}


	
	

}
