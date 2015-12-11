package mx.com.nok.adquisicion.dao;

import java.util.List;

import mx.com.nok.adquisicion.model.dto.AdquisicionDTO;

public interface IAdquisicionDAO {
	
	public List<AdquisicionDTO> getAdquisiciones(AdquisicionDTO adquisicion) throws Exception;
	public AdquisicionDTO insertAdquisicion(AdquisicionDTO adquisicion) throws Exception;
	public AdquisicionDTO updateAdquisicion(AdquisicionDTO adquisicion) throws Exception;
	public Boolean deleteAdquisicion(AdquisicionDTO adquisicion) throws Exception;
	
}
