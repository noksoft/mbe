package mx.com.nok.notificacion.model.service;

import java.util.List;

import mx.com.nok.notificacion.model.dto.NotificacionDTO;







public interface NotificacionService {

	public NotificacionDTO insertNotificacion(NotificacionDTO dto);
	public NotificacionDTO updateNotificacion(NotificacionDTO dto);
	public List<?> infoNotificacion(NotificacionDTO dto);
	public boolean deleteNotificacion(NotificacionDTO dto);
	
	
	public NotificacionDTO insertNotificacionAopSession(NotificacionDTO dto);
	public NotificacionDTO updateNotificacionAopSession(NotificacionDTO dto);
	public List<?> infoNotificacionAopSession(NotificacionDTO dto);
	public boolean deleteNotificacionAopSession(NotificacionDTO dto);
	
	
	
	

}
