package mx.com.nok.solicitud.model.service;

import java.util.List;

import mx.com.nok.solicitud.model.dto.SolicitudDTO;

public interface ISolicitudBussiness {
	
	public List<SolicitudDTO> getSolicitudes (SolicitudDTO solicitud);
	public SolicitudDTO insertSolicitud(SolicitudDTO solicitud);
	public SolicitudDTO updateSolicitud(SolicitudDTO solicitud);
	public Boolean deleteSolicitud(SolicitudDTO solicitud);
	
	//Método que nos permite recibir un array de solicitudes
	public void updateSolicitudes (List<SolicitudDTO> list);
}
