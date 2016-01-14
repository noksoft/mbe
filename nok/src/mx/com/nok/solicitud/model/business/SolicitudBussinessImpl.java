package mx.com.nok.solicitud.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.articulo.dao.ArticuloDAO;
import mx.com.nok.articulo.model.dto.ArticuloDTO;
import mx.com.nok.solicitud.dao.ISolicitudDAO;
import mx.com.nok.solicitud.model.dto.SolicitudDTO;
import mx.com.nok.solicitud.model.service.ISolicitudBussiness;

public class SolicitudBussinessImpl implements ISolicitudBussiness, Serializable {

	private static final long serialVersionUID = 1L;
	
	private ISolicitudDAO solicitudDAO;
	private ArticuloDAO articuloDao;

	@Override
	public List<SolicitudDTO> getSolicitudes(SolicitudDTO solicitud) {
		List<SolicitudDTO> listSolicitudes = new ArrayList<>();
		try{
			listSolicitudes = solicitudDAO.getSolicitudes(solicitud);
		}catch(Exception e){
			e.printStackTrace();
			listSolicitudes = null;
		}
		return listSolicitudes;
	}

	@Override
	public SolicitudDTO insertSolicitud(SolicitudDTO solicitud) {
		try{
			System.out.println("Nombre Solicitud: " + solicitud.getNombre_solicitud());
			return (SolicitudDTO)solicitudDAO.insertSolicitud(solicitud);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SolicitudDTO updateSolicitud(SolicitudDTO solicitud) {
		try{
			return (SolicitudDTO)solicitudDAO.updateSolicitud(solicitud);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void updateSolicitudes(List<SolicitudDTO> list){
		try{
			for (SolicitudDTO solicitud : list){
				switch(solicitud.getEstatus_proceso()){
					case "Compra":
							System.out.println(solicitud.getId_articulo());
							if(solicitud.getId_articulo() != null){
								
								ArticuloDTO articulo = articuloDao.findArticuloById(new ArticuloDTO(solicitud.getId_articulo()));
								int cantidadArticulo = (int) articulo.getCantidad();
								int cantidadSolicitud = Integer.valueOf(solicitud.getCantidad()).intValue();
								articulo.setCantidad(cantidadArticulo + cantidadSolicitud);
								
								articuloDao.updateCantidadArticulo(articulo);
								solicitudDAO.updateSolicitud(solicitud);
							}
						break;
					case "Adquicion":
						break;
					default:
						break;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public Boolean deleteSolicitud(SolicitudDTO solicitud) {
		try{
			return solicitudDAO.deleteSolicitud(solicitud);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public ISolicitudDAO getSolicitudDAO() {
		return solicitudDAO;
	}

	public void setSolicitudDAO(ISolicitudDAO solicitudDAO) {
		this.solicitudDAO = solicitudDAO;
	}

	public ArticuloDAO getArticuloDao() {
		return articuloDao;
	}

	public void setArticuloDao(ArticuloDAO articuloDao) {
		this.articuloDao = articuloDao;
	}

}
