package mx.com.nok.proveedor.dao;

import java.util.List;

import mx.com.nok.proveedor.model.dto.ProveedorDTO;



public interface ProveedorDAO {

	
	public List<?> infoProveedor(ProveedorDTO dto) throws Exception;
	public ProveedorDTO insertProveedor(ProveedorDTO dto) throws Exception;
	public ProveedorDTO updateProveedor(ProveedorDTO dto)throws Exception;
	public boolean deleteProveedor(ProveedorDTO dto) throws Exception;
	public ProveedorDTO updateEstatusProveedor(ProveedorDTO dto)throws Exception;
}
