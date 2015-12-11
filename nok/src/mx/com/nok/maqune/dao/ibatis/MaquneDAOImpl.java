package mx.com.nok.maqune.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.articulo.model.dto.ArticuloDTO;
import mx.com.nok.falla.model.dto.FallaDTO;
import mx.com.nok.maqune.dao.MaquneDAO;
import mx.com.nok.maqune.model.dto.MaquneChkListDTO;
import mx.com.nok.maqune.model.dto.MaquneDTO;
import mx.com.nok.maqune.model.dto.MaquneEmpleadoDTO;
import mx.com.nok.maqune.model.dto.MaquneRentaDTO;

public class MaquneDAOImpl   extends SqlMapClientDaoSupport implements MaquneDAO {

	

	
	public List<?> infoMaqune(MaquneDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
				queryForList("infoMaqune",dto);
	}
	
	public List<?> insertMaqune(MaquneDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("insertMaqune",dto);
	}

	
	public MaquneDTO updateMaqune(MaquneDTO dto) throws Exception {
		return (MaquneDTO)this.getSqlMapClientTemplate().
				queryForObject("updateMaqune",dto);
	}

	
	public boolean deleteMaqune(MaquneDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteMaqune",dto);
	}

	
	public MaquneDTO updateEstatusMaqune(MaquneDTO dto) throws Exception {
		return (MaquneDTO)this.getSqlMapClientTemplate().
				queryForObject("updateEstatusMaqune",dto);
	}
	
	
	
	public List<?> infoMaquneRenta(MaquneRentaDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
				queryForList("infoMaquneRenta",dto);
	}

	
	public MaquneRentaDTO insertMaquneRenta(MaquneRentaDTO dto) throws Exception {
		return (MaquneRentaDTO)this.getSqlMapClientTemplate().
				queryForObject("insertMaquneRenta",dto);
	}

	
	public MaquneRentaDTO updateMaquneRenta(MaquneRentaDTO dto) throws Exception {
		return (MaquneRentaDTO)this.getSqlMapClientTemplate().
				queryForObject("updateMaquneRenta",dto);
	}

	
	public boolean deleteMaquneRenta(MaquneRentaDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteMaquneRenta",dto);
	}
	
	
	public List<?> infoMaquneEmpleado(MaquneEmpleadoDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
				queryForList("infoMaquneEmpleado",dto);
	}

	
	public MaquneEmpleadoDTO insertMaquneEmpleado(MaquneEmpleadoDTO dto) throws Exception {
		return (MaquneEmpleadoDTO)this.getSqlMapClientTemplate().
				queryForObject("insertMaquneEmpleado",dto);
	}

	
	public MaquneEmpleadoDTO updateMaquneEmpleado(MaquneEmpleadoDTO dto) throws Exception {
		return (MaquneEmpleadoDTO)this.getSqlMapClientTemplate().
				queryForObject("updateMaquneEmpleado",dto);
	}

	
	public boolean deleteMaquneEmpleado(MaquneEmpleadoDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteMaquneEmpleado",dto);
	}
	
	
	public List<?> infoMaquneChkList(MaquneChkListDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
				queryForList("infoMaquneChkList",dto);
	}

	
	public MaquneChkListDTO insertMaquneChkList(MaquneChkListDTO dto) throws Exception {
		return (MaquneChkListDTO)this.getSqlMapClientTemplate().
				queryForObject("insertMaquneChkList",dto);
	}

	
	public MaquneChkListDTO updateMaquneChkList(MaquneChkListDTO dto) throws Exception {
		return (MaquneChkListDTO)this.getSqlMapClientTemplate().
				queryForObject("updateMaquneChkList",dto);
	}

	
	public boolean deleteMaquneChkList(MaquneChkListDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteMaquneChkList",dto);
	}
	
	

}
