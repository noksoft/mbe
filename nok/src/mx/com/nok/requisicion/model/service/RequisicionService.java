package mx.com.nok.requisicion.model.service;

import java.util.List;


import mx.com.nok.requisicion.model.dto.RequisicionDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDetalleDTO;

public interface RequisicionService {

	
	public List<RequisicionDTO> infoRequisicion(RequisicionDTO dto);
	public RequisicionDTO insertRequisicion(RequisicionDTO dto);
	public RequisicionDTO updateRequisicion(RequisicionDTO dto);	
	public boolean deleteRequisicion(RequisicionDTO dto);
	
	public List<RequisicionDetalleDTO> infoRequisicionDetalle(RequisicionDetalleDTO dto);
	public RequisicionDetalleDTO insertRequisicionDetalle(RequisicionDetalleDTO dto);
	public RequisicionDetalleDTO updateRequisicionDetalle(RequisicionDetalleDTO dto);	
	public boolean deleteRequisicionDetalle(RequisicionDetalleDTO dto);
	
}
