package mx.com.nok.equipo.dao;

import java.util.List;

import mx.com.nok.equipo.model.dto.EquipoDTO;
import mx.com.nok.equipo.model.dto.MarcaMotorDTO;

public interface EquipoDAO {
	
	
	public EquipoDTO insertEquipo(EquipoDTO dto)throws Exception;
	public EquipoDTO updateEquipo(EquipoDTO dto) throws Exception;
	public List<?> infoEquipo(EquipoDTO dto) throws Exception;
	public boolean deleteEquipo(EquipoDTO dto) throws Exception;
	public EquipoDTO updateEstatusEquipo(EquipoDTO dto)throws Exception;

	//MarcasMotor
	public List<?> infoMarcasMotor(MarcaMotorDTO dto) throws Exception;
	public MarcaMotorDTO insertMarcamotor(MarcaMotorDTO dto) throws Exception;
	public MarcaMotorDTO updateMarcamotor(MarcaMotorDTO dto) throws Exception;
	public boolean deleteMarcamotor(MarcaMotorDTO dto) throws Exception;
}
