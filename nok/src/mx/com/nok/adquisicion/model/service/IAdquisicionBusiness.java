package mx.com.nok.adquisicion.model.service;

import java.util.List;

import mx.com.nok.adquisicion.model.dto.AdquisicionDTO;

public interface IAdquisicionBusiness {
	
	public List<AdquisicionDTO> getAdquisiciones(AdquisicionDTO adquisicion);
	public AdquisicionDTO insertAdquisicion(AdquisicionDTO adquisicion);
	public AdquisicionDTO updateAdquisicion(AdquisicionDTO adquisicion);
	public Boolean deleteAdquisicion(AdquisicionDTO adquisicion);
}
