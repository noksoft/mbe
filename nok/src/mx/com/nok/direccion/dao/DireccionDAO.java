package mx.com.nok.direccion.dao;

import java.util.List;

import mx.com.nok.direccion.model.dto.EntidadDTO;
import mx.com.nok.direccion.model.dto.LocalidadDTO;
import mx.com.nok.direccion.model.dto.MunicipioDTO;

public interface DireccionDAO {

	
	
	//Servicios Marca
	public List<?> catEntidad(EntidadDTO dto) throws Exception;
	public EntidadDTO insertEntidad(EntidadDTO dto)throws Exception;
	public EntidadDTO updateEntidad(EntidadDTO dto)throws Exception;
	public boolean deleteEntidad(EntidadDTO dto)throws Exception;
	
	
	//Servicios Marca
	public List<?> catLocalidad(LocalidadDTO dto)throws Exception;
	public LocalidadDTO insertLocalidad(LocalidadDTO dto)throws Exception;
	public LocalidadDTO updateLocalidad(LocalidadDTO dto)throws Exception;
	public boolean deleteLocalidad(LocalidadDTO dto)throws Exception;
	
	
	
	//Servicios Marca
	public List<?> catMunicipio(MunicipioDTO dto)throws Exception;
	public MunicipioDTO insertMunicipio(MunicipioDTO dto)throws Exception;
	public MunicipioDTO updateMunicipio(MunicipioDTO dto)throws Exception;
	public boolean deleteMunicipio(MunicipioDTO dto)throws Exception;
		
	
	
}
