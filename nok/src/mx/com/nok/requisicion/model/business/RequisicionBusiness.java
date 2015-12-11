package mx.com.nok.requisicion.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.requisicion.dao.RequisicionDAO;
import mx.com.nok.requisicion.model.dto.RequisicionDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDetalleDTO;
import mx.com.nok.requisicion.model.service.RequisicionService;

public class RequisicionBusiness implements Serializable,RequisicionService {

	private RequisicionDAO requisicionDAO;
	private static final long serialVersionUID = 1L;
	
	public List<RequisicionDetalleDTO> infoRequisicionDetalle(RequisicionDetalleDTO dto) {
		List <RequisicionDetalleDTO> list= new ArrayList<RequisicionDetalleDTO>();
		try {			
			
			list=requisicionDAO.infoRequisicionDetalle(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public RequisicionDetalleDTO insertRequisicionDetalle(RequisicionDetalleDTO dto) {
		try {
			return requisicionDAO.insertRequisicionDetalle(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}

	
	public RequisicionDetalleDTO updateRequisicionDetalle(RequisicionDetalleDTO dto) {
		try {
			return requisicionDAO.updateRequisicionDetalle(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}
	
	
	public boolean deleteRequisicionDetalle(RequisicionDetalleDTO dto) {
		try {
			return (Boolean)requisicionDAO.deleteRequisicionDetalle(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	
	
	@SuppressWarnings("unused")
	public List<RequisicionDTO> infoRequisicion(RequisicionDTO dto) {
		List <RequisicionDTO> list= new ArrayList<RequisicionDTO>();
		try {			
			
			list=(List<RequisicionDTO>) requisicionDAO.infoRequisicion(dto);	
			if(list != null && list.size() > 0){
				for(RequisicionDTO req : list){
					if(req != null && req.getFolioReq() != null){
						RequisicionDetalleDTO tempReq = new RequisicionDetalleDTO();
						tempReq.setIdRequisicionDetalle("");
						tempReq.setEstatusRequisicionDetalle(RequisicionDetalleDTO.NUEVO);
						tempReq.setIdArticulo("");
						tempReq.setIdRequisicion(req.getFolioReq());
						req.setListRequisicionDetalle(requisicionDAO.infoRequisicionDetalle(tempReq));
					}
				}
			}
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public RequisicionDTO insertRequisicion(RequisicionDTO dto) {
		try {
			
			RequisicionDTO requisicionDTO;
			if(dto.getIdFalla() != null
					&& dto.getIdFalla() != ""){
				requisicionDTO = requisicionDAO.insertRequisicion(dto);
			}else{
				requisicionDTO = requisicionDAO.insertRequisicionSinFalla(dto);
			}
			if(dto.getListRequisicionDetalle() != null 
					&& !dto.getListRequisicionDetalle().isEmpty()
					&& requisicionDTO.getFolioReq() != null
					&& requisicionDTO.getFolioReq() != ""){
				List<RequisicionDetalleDTO> listRequisicionesDetalle = new ArrayList<RequisicionDetalleDTO>();
				for (RequisicionDetalleDTO reqDet : dto.getListRequisicionDetalle()){
					reqDet.setIdRequisicion(requisicionDTO.getFolioReq());
					listRequisicionesDetalle.add(requisicionDAO.insertRequisicionDetalle(reqDet));
				}
				requisicionDTO.setListRequisicionDetalle(listRequisicionesDetalle);
			}
			return requisicionDTO;
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}

	
	public RequisicionDTO updateRequisicion(RequisicionDTO dto) {
		try {
			RequisicionDTO requisicion;
			if(dto.getIdFalla() != null
					&& dto.getIdFalla() != ""){
				requisicion = requisicionDAO.updateRequisicion(dto); 
			}else{
				requisicion = requisicionDAO.updateRequisicionSinFalla(dto);
			}
			if(dto.getListRequisicionDetalle() != null 
					&& !dto.getListRequisicionDetalle().isEmpty()){
				for(RequisicionDetalleDTO reqDet : dto.getListRequisicionDetalle()){
					if(reqDet.getEstatusRequisicionDetalle().equals(RequisicionDetalleDTO.NUEVO)
							&& reqDet.getIdRequisicion().equals("")){
						reqDet.setIdRequisicion(dto.getFolioReq());
						requisicionDAO.insertRequisicionDetalle(reqDet);
					}else if(reqDet.getEstatusRequisicionDetalle().equals(RequisicionDetalleDTO.ACTUALIZADO)
							&& reqDet.getIdRequisicion() != null && reqDet.getIdRequisicion() != ""){
						reqDet.setEstatusRequisicionDetalle(RequisicionDetalleDTO.NUEVO);
						reqDet.setIdRequisicion(dto.getFolioReq());
						requisicionDAO.updateRequisicionDetalle(reqDet);
					}else if(reqDet.getEstatusRequisicionDetalle().equals(RequisicionDetalleDTO.BAJA)
							&& reqDet.getIdRequisicion() != null && reqDet.getIdRequisicion() != ""){
						requisicionDAO.deleteRequisicionDetalle(reqDet);
					}
				}
				/*List<RequisicionDetalleDTO> listUpdateDetalle = new ArrayList<RequisicionDetalleDTO>();
				RequisicionDetalleDTO requisicionDetalle = new RequisicionDetalleDTO();
				requisicionDetalle.setIdRequisicion(dto.getFolioReq());
				listUpdateDetalle = infoRequisicionDetalle(requisicionDetalle);
*/
			}
			return requisicion; 
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}
	
	/**
	 * Elimina las requisicion Detalle asignadas a la Requisici—n, 
	 * antes de actualizar o asignar la nueva lista de RequisicionDetalle 
	 * asociadas a la Requisici—n
	 * @param dto RequisicionDTO de la cual se van a buscar sus RequisicionesDetalle
	 * @return Boolean Si todo es correcto regresa true
	 */
	private Boolean deleteRequisicionesDetalle(RequisicionDTO dto){
		Boolean flag = false;
		RequisicionDetalleDTO reqDetalle = new RequisicionDetalleDTO();
		reqDetalle.setIdRequisicion(dto.getFolioReq());
		List<RequisicionDetalleDTO> listRequisicionDetalle = new ArrayList<RequisicionDetalleDTO>();
		try {
			listRequisicionDetalle = requisicionDAO.infoRequisicionDetalle(reqDetalle);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			return flag;
		}
		
		if(listRequisicionDetalle != null && !listRequisicionDetalle.isEmpty()){
			for (RequisicionDetalleDTO reqDet:listRequisicionDetalle){
				deleteRequisicionDetalle(reqDet);
			}
		}
		return flag;
	}
	
	
	public boolean deleteRequisicion(RequisicionDTO dto) {
		try {
			return (Boolean)requisicionDAO.deleteRequisicion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	public RequisicionDAO getRequisicionDAO() {
		return requisicionDAO;
	}

	public void setRequisicionDAO(RequisicionDAO requisicionDAO) {
		this.requisicionDAO = requisicionDAO;
	}
	
}
