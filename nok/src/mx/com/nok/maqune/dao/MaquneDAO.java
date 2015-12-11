package mx.com.nok.maqune.dao;

import java.util.List;

import mx.com.nok.maqune.model.dto.MaquneChkListDTO;
import mx.com.nok.maqune.model.dto.MaquneDTO;
import mx.com.nok.maqune.model.dto.MaquneEmpleadoDTO;
import mx.com.nok.maqune.model.dto.MaquneRentaDTO;

public interface MaquneDAO {
	
	
	public List<?> insertMaqune(MaquneDTO dto)throws Exception;
	public MaquneDTO updateMaqune(MaquneDTO dto) throws Exception;
	public List<?> infoMaqune(MaquneDTO dto) throws Exception;
	public boolean deleteMaqune(MaquneDTO dto) throws Exception;
	public MaquneDTO updateEstatusMaqune(MaquneDTO dto)throws Exception;
	
	public MaquneRentaDTO insertMaquneRenta(MaquneRentaDTO dto)throws Exception;
	public MaquneRentaDTO updateMaquneRenta(MaquneRentaDTO dto)throws Exception;
	public List<?> infoMaquneRenta(MaquneRentaDTO dto)throws Exception;
	public boolean deleteMaquneRenta(MaquneRentaDTO dto)throws Exception;
	
	public MaquneEmpleadoDTO insertMaquneEmpleado(MaquneEmpleadoDTO dto)throws Exception;
	public MaquneEmpleadoDTO updateMaquneEmpleado(MaquneEmpleadoDTO dto)throws Exception;
	public List<?> infoMaquneEmpleado(MaquneEmpleadoDTO dto)throws Exception;
	public boolean deleteMaquneEmpleado(MaquneEmpleadoDTO dto)throws Exception;
	
	
	public MaquneChkListDTO insertMaquneChkList(MaquneChkListDTO dto)throws Exception;
	public MaquneChkListDTO updateMaquneChkList(MaquneChkListDTO dto)throws Exception;
	public List<?> infoMaquneChkList(MaquneChkListDTO dto)throws Exception;
	public boolean deleteMaquneChkList(MaquneChkListDTO dto)throws Exception;
	
	
	

}
