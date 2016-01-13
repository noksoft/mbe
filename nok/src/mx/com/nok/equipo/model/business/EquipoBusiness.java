package mx.com.nok.equipo.model.business;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mx.com.nok.equipo.dao.DiagnosticoDAO;
import mx.com.nok.equipo.dao.EquipoDAO;
import mx.com.nok.equipo.model.dto.DiagnosticoDTO;
import mx.com.nok.equipo.model.dto.DiagnosticoDetalle;
import mx.com.nok.equipo.model.dto.EquipoDTO;
import mx.com.nok.equipo.model.dto.MarcaMotorDTO;
import mx.com.nok.equipo.model.service.DiagnositicoService;
import mx.com.nok.equipo.model.service.EquipoService;
import mx.com.nok.menu.model.dto.MenuDTO;
import mx.com.nok.utils.FileUtils;

public class EquipoBusiness implements  Serializable, EquipoService, DiagnositicoService{
	
	
	private static final long serialVersionUID = 1L;
	
	private EquipoDAO equipoDAO;
	private DiagnosticoDAO diagnosticoDAO;

	public  List<?> infoEquipo(EquipoDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list= equipoDAO.infoEquipo(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	private void cargarImagenes (EquipoDTO dto){
		
		if(dto.getFotoequipo().length() > 0){
			FileUtils.uploadFile(dto.getFotoequipo(), dto.getContentFoto(), 1);
		}
		/*if(dto.getFotofactura().length() > 0){
			FileUtils.uploadFile(dto.getFotofactura(), dto.getContentFactura(), 2);
		}
		if(dto.getFotopedimento().length() > 0){
			FileUtils.uploadFile(dto.getFotopedimento(), dto.getContentPedimento(), 3);
		}*/
		
	}
	
	public EquipoDTO insertEquipo(EquipoDTO dto) {
		try {
			cargarImagenes(dto);			
			
			return equipoDAO.insertEquipo(dto);			
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public EquipoDTO updateEquipo(EquipoDTO dto) {
		try {
			return equipoDAO.updateEquipo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	
	public boolean deleteEquipo(EquipoDTO dto) {
		try {
			return (Boolean)equipoDAO.deleteEquipo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	public EquipoDTO updateEstatusEquipo(EquipoDTO dto){
		try {
			return equipoDAO.updateEstatusEquipo(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//Metódo para obtener la lista de Marcas de Motor
	public List<?> infoMarcasMotor(MarcaMotorDTO dto) {
		List <?> list = new ArrayList<MarcaMotorDTO>();
		try{
			list = equipoDAO.infoMarcasMotor(dto);
		}catch (Exception e){
			e.printStackTrace();
			list = null;
		}
		return list;
	}


	public EquipoDAO getEquipoDAO() {
		return equipoDAO;
	}


	public void setEquipoDAO(EquipoDAO equipoDAO) {
		this.equipoDAO = equipoDAO;
	}


	@Override
	public MarcaMotorDTO insertMarcamotor(MarcaMotorDTO dto) {
		try{
			return equipoDAO.insertMarcamotor(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public MarcaMotorDTO updateMarcamotor(MarcaMotorDTO dto) {
		try{
			return equipoDAO.updateMarcamotor(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public boolean deleteMarcamotor(MarcaMotorDTO dto) {
		try {
			return (Boolean)equipoDAO.deleteMarcamotor(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public DiagnosticoDTO insertDiagnostico(DiagnosticoDTO dto) {
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
			String date = sdf.format(new Date()); 
			dto.setFecha_alta(date);
			updateTypeDiagnosticoDTO(dto);
			return diagnosticoDAO.insertDiagnostico(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public DiagnosticoDTO updateDiagnostico(DiagnosticoDTO dto) {
		try{
			updateTypeDiagnosticoDTO(dto);
			return diagnosticoDAO.updateDiagnostico(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	private void updateTypeDiagnosticoDTO(DiagnosticoDTO dto){
		if(dto.getId_empleado() != null && dto.getId_equipo() != null
				&& dto.getId_empleado() != "" && dto.getId_equipo() != ""){
			dto.setType("empleado_equipo");
		}else if(dto.getId_empleado() != null && dto.getId_empleado() != ""){
			dto.setType("empleado");
		}else if(dto.getId_equipo() != null && dto.getId_equipo() != ""){
			dto.setType("equipo");
		}
		
		
	}


	@Override
	public boolean deleteDiagnostico(DiagnosticoDTO dto) {
		try{
			return diagnosticoDAO.deleteDiagnostico(dto);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public List<DiagnosticoDTO> getDiagnosticos(DiagnosticoDTO dto) {
		List<DiagnosticoDTO> list = null;
		try{
			list = diagnosticoDAO.findDiagnosticos(dto);
			for (DiagnosticoDTO diagnosticoDTO : list){
				List<DiagnosticoDetalle> listDiagnosticoDetalle = new ArrayList<>();
				DiagnosticoDetalle detalleDTO = new DiagnosticoDetalle();
				if(diagnosticoDTO.getId_t_diagnostico() != null 
						&& diagnosticoDTO.getId_t_diagnostico() != ""){
					detalleDTO.setId_t_diagnostico(diagnosticoDTO.getId_t_diagnostico());
					detalleDTO.setId_t_diagnostico_detalle(new String());
					detalleDTO.setId_equipo(new String());
					detalleDTO.setId_empleado(new String());
					listDiagnosticoDetalle = getDiagnosticoDetalle(detalleDTO);
					diagnosticoDTO.setDetalle(listDiagnosticoDetalle);
					
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public DiagnosticoDetalle insertDiagnosticoDetalle(DiagnosticoDetalle dto) {
		try{
			return diagnosticoDAO.insertDiagnosticoDetalle(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public DiagnosticoDetalle updateDiagnosticoDetalle(DiagnosticoDetalle dto) {
		try{
			return diagnosticoDAO.updateDiagnosticoDetalle(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public boolean deleteDiagnosticoDetalle(DiagnosticoDetalle dto) {
		try{
			return diagnosticoDAO.deleteDiagnosticoDetalle(dto);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public List<DiagnosticoDetalle> getDiagnosticoDetalle(DiagnosticoDetalle dto) {
		List<DiagnosticoDetalle> list = new ArrayList<>();
		try{
			list = diagnosticoDAO.getDiagnosticoDetalle(dto);
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}


	public DiagnosticoDAO getDiagnosticoDAO() {
		return diagnosticoDAO;
	}


	public void setDiagnosticoDAO(DiagnosticoDAO diagnosticoDAO) {
		this.diagnosticoDAO = diagnosticoDAO;
	}

}
