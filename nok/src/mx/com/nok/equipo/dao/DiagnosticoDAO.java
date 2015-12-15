package mx.com.nok.equipo.dao;

import java.util.List;

import mx.com.nok.equipo.model.dto.DiagnosticoDTO;
import mx.com.nok.equipo.model.dto.DiagnosticoDetalle;

public interface DiagnosticoDAO {
	
	//DIAGNOSTICO
	public List<DiagnosticoDTO> findDiagnosticos(DiagnosticoDTO dto)throws Exception;
	public DiagnosticoDTO insertDiagnostico(DiagnosticoDTO dto)throws Exception;
	public DiagnosticoDTO updateDiagnostico(DiagnosticoDTO dto)throws Exception;
	public boolean deleteDiagnostico(DiagnosticoDTO dto)throws Exception;
	
	//DIAGNOSTICO DETALLE
	public List<DiagnosticoDetalle> getDiagnosticoDetalle(DiagnosticoDetalle dto)throws Exception;
	public DiagnosticoDetalle insertDiagnosticoDetalle(DiagnosticoDetalle dto)throws Exception;
	public DiagnosticoDetalle updateDiagnosticoDetalle(DiagnosticoDetalle dto)throws Exception;
	public boolean deleteDiagnosticoDetalle(DiagnosticoDetalle dto)throws Exception;
}
