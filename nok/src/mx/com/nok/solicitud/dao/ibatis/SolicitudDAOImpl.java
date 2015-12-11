package mx.com.nok.solicitud.dao.ibatis;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.solicitud.dao.ISolicitudDAO;
import mx.com.nok.solicitud.model.dto.SolicitudDTO;

public class SolicitudDAOImpl extends SqlMapClientDaoSupport implements ISolicitudDAO, Serializable {

	private static final long serialVersionUID = 3996340461370178920L;

	@SuppressWarnings("unchecked")
	@Override
	public List<SolicitudDTO> getSolicitudes(SolicitudDTO solicitud) throws Exception{
		return this.getSqlMapClientTemplate().queryForList("getSolicitudes", solicitud);
	}

	@Override
	public SolicitudDTO insertSolicitud(SolicitudDTO solicitud) throws Exception {
		return (SolicitudDTO)this.getSqlMapClientTemplate().queryForObject("insertSolicitud", typeSolicitud(solicitud));
	}
	
	private SolicitudDTO typeSolicitud(SolicitudDTO solicitud){
		if(solicitud.getId_falla() != null && solicitud.getId_falla() != ""
				&& solicitud.getId_empleado_adquisicion() != null && solicitud.getId_empleado_adquisicion() != ""
				&& solicitud.getId_empleado_requisicion() != null && solicitud.getId_empleado_requisicion() != ""){
			solicitud.setType_insert("ALL");
		}else if(solicitud.getId_falla() != null && solicitud.getId_falla() != ""
				&& solicitud.getId_empleado_requisicion() != null && solicitud.getId_empleado_requisicion() != ""
				&& (solicitud.getId_empleado_adquisicion() == null || solicitud.getId_empleado_adquisicion() == "")){
			solicitud.setType_insert("WITHOUT_ADQUISICION");
		}else if(solicitud.getId_falla() != null && solicitud.getId_falla() != ""
				&& solicitud.getId_empleado_adquisicion() != null && solicitud.getId_empleado_adquisicion() != ""
				&& (solicitud.getId_empleado_requisicion() == null || solicitud.getId_empleado_requisicion() == "")){
			solicitud.setType_insert("WITHOUT_REQUISICION");
		}else if(solicitud.getId_empleado_adquisicion() != null && solicitud.getId_empleado_adquisicion() != ""
				&& (solicitud.getId_falla() == null || solicitud.getId_falla() == "")
				&& (solicitud.getId_empleado_requisicion() == null || solicitud.getId_empleado_requisicion() == "")){
			solicitud.setType_insert("WITHOUT_FALLA_AND_REQUISICION");
		}else if(solicitud.getId_empleado_requisicion() != null && solicitud.getId_empleado_requisicion() != ""
				&& (solicitud.getId_falla() == null || solicitud.getId_falla() == "")
				&& (solicitud.getId_empleado_adquisicion() == null || solicitud.getId_empleado_adquisicion() == "")){
			solicitud.setType_insert("WITHOUT_FALLA_AND_ADQUISICION");
		}
		
		return solicitud;
	}

	@Override
	public SolicitudDTO updateSolicitud(SolicitudDTO solicitud) throws Exception {
		return (SolicitudDTO)this.getSqlMapClientTemplate().queryForObject("updateSolicitud", typeSolicitud(solicitud));
	}

	@Override
	public Boolean deleteSolicitud(SolicitudDTO solicitud) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().queryForObject("deleteSolicitud", solicitud);
	}
	
}
