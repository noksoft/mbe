package mx.com.nok.notificacion.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.core.usuario.dao.PerfilDAO;

import mx.com.nok.menu.model.dto.MenuDTO;
import mx.com.nok.notificacion.dao.NotificacionDAO;
import mx.com.nok.notificacion.model.dto.NotificacionDTO;
import mx.com.nok.notificacion.model.service.NotificacionService;
import mx.com.nok.proveedor.model.dto.ProveedorDTO;

public class NotificacionBusiness implements  Serializable,NotificacionService{

	
	
	
	private NotificacionDAO notificacionDAO;
	private static final long serialVersionUID = 1L;

	
	
	public  List<?> infoNotificacion(NotificacionDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list=notificacionDAO.infoNotificacion(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}


	
	public NotificacionDTO insertNotificacion(NotificacionDTO dto) {
		try {
			return notificacionDAO.insertNotificacion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}


	
	public NotificacionDTO updateNotificacion(NotificacionDTO dto) {
		try {
			
			return notificacionDAO.updateNotificacion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	
	public boolean deleteNotificacion(NotificacionDTO dto) {
		try {
			return (Boolean)notificacionDAO.deleteNotificacion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}



	public NotificacionDAO getNotificacionDAO() {
		return notificacionDAO;
	}



	public void setNotificacionDAO(NotificacionDAO notificacionDAO) {
		this.notificacionDAO = notificacionDAO;
	}

	
	
//-------------------------------------------------------------------------
	
	
	public  List<?> infoNotificacionAopSession(NotificacionDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list=notificacionDAO.infoNotificacion(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}


	
	public NotificacionDTO insertNotificacionAopSession(NotificacionDTO dto) {
		try {
			return notificacionDAO.insertNotificacion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}


	
	public NotificacionDTO updateNotificacionAopSession(NotificacionDTO dto) {
		try {
			
			return notificacionDAO.updateNotificacion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	
	public boolean deleteNotificacionAopSession(NotificacionDTO dto) {
		try {
			return (Boolean)notificacionDAO.deleteNotificacion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	

}
