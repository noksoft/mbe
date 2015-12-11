package mx.com.nok.solicitud.dao;

import java.util.List;

import mx.com.nok.solicitud.model.dto.SolicitudDTO;

public interface ISolicitudDAO {
	
	public List<SolicitudDTO> getSolicitudes (SolicitudDTO solicitud) throws Exception;
	public SolicitudDTO insertSolicitud(SolicitudDTO solicitud) throws Exception;
	public SolicitudDTO updateSolicitud(SolicitudDTO solicitud) throws Exception;
	public Boolean deleteSolicitud(SolicitudDTO solicitud) throws Exception;
}
