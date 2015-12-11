package mx.com.nok.maqune.model.service;

import java.util.List;

import mx.com.nok.maqune.model.dto.MaquneChkListDTO;
import mx.com.nok.maqune.model.dto.MaquneDTO;
import mx.com.nok.maqune.model.dto.MaquneEmpleadoDTO;
import mx.com.nok.maqune.model.dto.MaquneRentaDTO;


public interface MaquneService {

	public List<?> insertMaquneAopSession(MaquneDTO dto);
	public MaquneDTO updateMaquneAopSession(MaquneDTO dto);
	public List<?> infoMaquneAopSession(MaquneDTO dto);
	public boolean deleteMaquneAopSession(MaquneDTO dto);
	public MaquneDTO updateEstatusMaquneAopSession(MaquneDTO dto);	
	
	
	public MaquneRentaDTO insertMaquneRentaAopSession(MaquneRentaDTO dto);
	public MaquneRentaDTO updateMaquneRentaAopSession(MaquneRentaDTO dto);
	public List<?> infoMaquneRentaAopSession(MaquneRentaDTO dto);
	public boolean deleteMaquneRentaAopSession(MaquneRentaDTO dto);
	
	public MaquneEmpleadoDTO insertMaquneEmpleadoAopSession(MaquneEmpleadoDTO dto);
	public MaquneEmpleadoDTO updateMaquneEmpleadoAopSession(MaquneEmpleadoDTO dto);
	public List<?> infoMaquneEmpleadoAopSession(MaquneEmpleadoDTO dto);
	public boolean deleteMaquneEmpleadoAopSession(MaquneEmpleadoDTO dto);
	
	
	public MaquneChkListDTO insertMaquneChkListAopSession(MaquneChkListDTO dto);
	public MaquneChkListDTO updateMaquneChkListAopSession(MaquneChkListDTO dto);
	public List<?> infoMaquneChkListAopSession(MaquneChkListDTO dto);
	public boolean deleteMaquneChkListAopSession(MaquneChkListDTO dto);


}
