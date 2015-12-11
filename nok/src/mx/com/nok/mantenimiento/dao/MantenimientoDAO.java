package mx.com.nok.mantenimiento.dao;

import java.util.List;

import mx.com.nok.mantenimiento.model.dto.DetalleManttoDTO;
import mx.com.nok.mantenimiento.model.dto.ProgramaManttoDTO;


public interface MantenimientoDAO {
	
		
	public List<?> infoDetalleMantenimiento( DetalleManttoDTO dto)throws Exception;
	public  DetalleManttoDTO insertDetalleMantenimiento(DetalleManttoDTO dto)throws Exception;
	public  DetalleManttoDTO updateDetalleMantenimiento( DetalleManttoDTO dto)throws Exception;	
	public boolean deleteDetalleMantenimiento(DetalleManttoDTO dto)throws Exception;	
	
	
	public List<?> infoProgramaMantenimiento( ProgramaManttoDTO dto)throws Exception;
	public  ProgramaManttoDTO insertProgramaMantenimiento(ProgramaManttoDTO dto)throws Exception;
	public  ProgramaManttoDTO updateProgramaMantenimiento( ProgramaManttoDTO dto)throws Exception;	
	public boolean deleteProgramaMantenimiento(ProgramaManttoDTO dto)throws Exception;

}
