package mx.com.nok.notificacion.dao;

import java.util.List;

import mx.com.nok.notificacion.model.dto.NotificacionDTO;



public interface NotificacionDAO {
	
	
	public NotificacionDTO insertNotificacion(NotificacionDTO dto)throws Exception;
	public NotificacionDTO updateNotificacion(NotificacionDTO dto) throws Exception;
	public List<?> infoNotificacion(NotificacionDTO dto) throws Exception;
	public boolean deleteNotificacion(NotificacionDTO dto) throws Exception;

	
	
	
	

}
