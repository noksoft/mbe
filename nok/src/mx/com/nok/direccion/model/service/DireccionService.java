package mx.com.nok.direccion.model.service;

import java.util.List;

import mx.com.nok.articulo.model.dto.MarcaDTO;
import mx.com.nok.direccion.model.dto.EntidadDTO;
import mx.com.nok.direccion.model.dto.LocalidadDTO;
import mx.com.nok.direccion.model.dto.MunicipioDTO;

public interface DireccionService {
	
	//Servicios Entidad
	public List<?> catEntidad(EntidadDTO dto);
	public EntidadDTO insertEntidad(EntidadDTO dto);
	public EntidadDTO updateEntidad(EntidadDTO dto);
	public boolean deleteEntidad(EntidadDTO dto);
	
	
	//Servicios Localidad
	public List<?> catLocalidad(LocalidadDTO dto);
	public LocalidadDTO insertLocalidad(LocalidadDTO dto);
	public LocalidadDTO updateLocalidad(LocalidadDTO dto);
	public boolean deleteLocalidad(LocalidadDTO dto);
	
	
	
	//Servicios Municipio
	public List<?> catMunicipio(MunicipioDTO dto);
	public MunicipioDTO insertMunicipio(MunicipioDTO dto);
	public MunicipioDTO updateMunicipio(MunicipioDTO dto);
	public boolean deleteMunicipio(MunicipioDTO dto);
	
	
	
	
	//Servicios Entidad
	public List<?> catEntidadAopSession(EntidadDTO dto);
	public EntidadDTO insertEntidadAopSession(EntidadDTO dto);
	public EntidadDTO updateEntidadAopSession(EntidadDTO dto);
	public boolean deleteEntidadAopSession(EntidadDTO dto);	
	
	//Servicios Localidad
	public List<?> catLocalidadAopSession(LocalidadDTO dto);
	public LocalidadDTO insertLocalidadAopSession(LocalidadDTO dto);
	public LocalidadDTO updateLocalidadAopSession(LocalidadDTO dto);
	public boolean deleteLocalidadAopSession(LocalidadDTO dto);	
	
	
	//Servicios Municipio
	public List<?> catMunicipioAopSession(MunicipioDTO dto);
	public MunicipioDTO insertMunicipioAopSession(MunicipioDTO dto);
	public MunicipioDTO updateMunicipioAopSession(MunicipioDTO dto);
	public boolean deleteMunicipioAopSession(MunicipioDTO dto);
		
	

}
