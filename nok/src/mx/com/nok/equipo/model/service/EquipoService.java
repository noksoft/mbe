package mx.com.nok.equipo.model.service;

import java.util.List;

import mx.com.nok.equipo.model.dto.EquipoDTO;
import mx.com.nok.equipo.model.dto.MarcaMotorDTO;

public interface EquipoService {

	public EquipoDTO insertEquipo(EquipoDTO dto);
	public EquipoDTO updateEquipo(EquipoDTO dto);
	public List<?> infoEquipo(EquipoDTO dto);
	public boolean deleteEquipo(EquipoDTO dto);
	public EquipoDTO updateEstatusEquipo(EquipoDTO dto);	
	
	//Servicio para obtener las marcas de motor
	public List<?> infoMarcasMotor(MarcaMotorDTO dto);
	public MarcaMotorDTO insertMarcamotor(MarcaMotorDTO dto);
	public MarcaMotorDTO updateMarcamotor(MarcaMotorDTO dto);
	public boolean deleteMarcamotor(MarcaMotorDTO dto);
}
