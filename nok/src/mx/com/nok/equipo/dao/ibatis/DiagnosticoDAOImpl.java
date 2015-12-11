package mx.com.nok.equipo.dao.ibatis;

import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import mx.com.nok.equipo.dao.DiagnosticoDAO;
import mx.com.nok.equipo.model.dto.DiagnosticoDTO;
import mx.com.nok.equipo.model.dto.DiagnosticoDetalle;

public class DiagnosticoDAOImpl extends SqlMapClientDaoSupport implements DiagnosticoDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<DiagnosticoDTO> getDiagnosticos(DiagnosticoDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("getDiagnostico", dto);
	}

	@Override
	public DiagnosticoDTO insertDiagnostico(DiagnosticoDTO dto) throws Exception {
		return (DiagnosticoDTO)this.getSqlMapClientTemplate().queryForObject("insertDiagnostico", dto);
	}

	@Override
	public DiagnosticoDTO updateDiagnostico(DiagnosticoDTO dto) throws Exception {
		return (DiagnosticoDTO)this.getSqlMapClientTemplate().queryForObject("updateDiagnostico", dto);
	}

	@Override
	public boolean deleteDiagnostico(DiagnosticoDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().queryForObject("deleteDiagnostico", dto);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DiagnosticoDetalle> getDiagnosticoDetalle(DiagnosticoDetalle dto) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("getDiagnosticoDetalle", dto);
	}

	@Override
	public DiagnosticoDetalle insertDiagnosticoDetalle(DiagnosticoDetalle dto) throws Exception {
		return (DiagnosticoDetalle)this.getSqlMapClientTemplate().queryForObject("insertDiagnosticoDetalle", dto);
	}

	@Override
	public DiagnosticoDetalle updateDiagnosticoDetalle(DiagnosticoDetalle dto) throws Exception {
		return (DiagnosticoDetalle)this.getSqlMapClientTemplate().queryForObject("updateDiagnosticoDetalle", dto);
	}

	@Override
	public boolean deleteDiagnosticoDetalle(DiagnosticoDetalle dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().queryForObject("deleteDiagnosticoDetalle", dto);
	}

}
