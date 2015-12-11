package mx.com.nok.equipo.model.service;

import java.util.List;

import mx.com.nok.equipo.model.dto.DiagnosticoDTO;
import mx.com.nok.equipo.model.dto.DiagnosticoDetalle;

public interface DiagnositicoService {
	
	//DIAGNOSTICO
	public DiagnosticoDTO insertDiagnostico(DiagnosticoDTO dto);
	public DiagnosticoDTO updateDiagnostico(DiagnosticoDTO dto);
	public boolean deleteDiagnostico(DiagnosticoDTO dto);
	public List<DiagnosticoDTO> getDiagnosticos(DiagnosticoDTO dto);
	
	//DIAGNOSTICO DETALLE
	public DiagnosticoDetalle insertDiagnosticoDetalle(DiagnosticoDetalle dto);
	public DiagnosticoDetalle updateDiagnosticoDetalle(DiagnosticoDetalle dto);
	public boolean deleteDiagnosticoDetalle(DiagnosticoDetalle dto);
	public List<DiagnosticoDetalle> getDiagnosticoDetalle(DiagnosticoDetalle dto);
}