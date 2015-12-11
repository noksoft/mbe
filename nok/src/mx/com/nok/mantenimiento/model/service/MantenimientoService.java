package mx.com.nok.mantenimiento.model.service;

import java.util.List;

import mx.com.nok.mantenimiento.model.dto.DetalleManttoDTO;
import mx.com.nok.mantenimiento.model.dto.ProgramaManttoDTO;
import mx.com.nok.salida.model.dto.SalidaAlmacenDTO;




public interface MantenimientoService {
	
	public List<?> infoDetalleMantenimiento( DetalleManttoDTO dto);
	public  DetalleManttoDTO insertDetalleMantenimiento(DetalleManttoDTO dto);
	public  DetalleManttoDTO updateDetalleMantenimiento( DetalleManttoDTO dto);	
	public boolean deleteDetalleMantenimiento(DetalleManttoDTO dto);	
	
	
	public List<?> infoProgramaMantenimiento( ProgramaManttoDTO dto);
	public  ProgramaManttoDTO insertProgramaMantenimiento(ProgramaManttoDTO dto);
	public  ProgramaManttoDTO updateProgramaMantenimiento( ProgramaManttoDTO dto);	
	public boolean deleteProgramaMantenimiento(ProgramaManttoDTO dto);
	
	
	public List<?> infoDetalleMantenimientoAopSession( DetalleManttoDTO dto);
	public  DetalleManttoDTO insertDetalleMantenimientoAopSession(DetalleManttoDTO dto);
	public  DetalleManttoDTO updateDetalleMantenimientoAopSession( DetalleManttoDTO dto);	
	public boolean deleteDetalleMantenimientoAopSession(DetalleManttoDTO dto);	
	
	
	public List<?> infoProgramaMantenimientoAopSession( ProgramaManttoDTO dto);
	public  ProgramaManttoDTO insertProgramaMantenimientoAopSession(ProgramaManttoDTO dto);
	public  ProgramaManttoDTO updateProgramaMantenimientoAopSession( ProgramaManttoDTO dto);	
	public boolean deleteProgramaMantenimientoAopSession(ProgramaManttoDTO dto);
	
	
	
	
	

}
