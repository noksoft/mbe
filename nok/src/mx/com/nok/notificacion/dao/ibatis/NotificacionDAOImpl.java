package mx.com.nok.notificacion.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;


import mx.com.nok.notificacion.dao.NotificacionDAO;
import mx.com.nok.notificacion.model.dto.NotificacionDTO;


public class NotificacionDAOImpl   extends SqlMapClientDaoSupport implements NotificacionDAO {

	

	
	public List<?> infoNotificacion(NotificacionDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
				queryForList("infoNotificacion",dto);
	}

	
	public NotificacionDTO insertNotificacion(NotificacionDTO dto) throws Exception {
		return (NotificacionDTO)this.getSqlMapClientTemplate().
				queryForObject("insertNotificacion",dto);
	}

	
	public NotificacionDTO updateNotificacion(NotificacionDTO dto) throws Exception {
		return (NotificacionDTO)this.getSqlMapClientTemplate().
				queryForObject("updateNotificacion",dto);
	}

	
	public boolean deleteNotificacion(NotificacionDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteNotificacion",dto);
	}

	
	
}
