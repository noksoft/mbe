package mx.com.nok.proveedor.model.service;

import java.util.List;

import mx.com.nok.proveedor.model.dto.ProveedorDTO;



public interface ProveedorService {
	
	
	public List<?> catProveedor(ProveedorDTO dto);
	public ProveedorDTO insertProveedor(ProveedorDTO dto);
	public ProveedorDTO updateProveedor(ProveedorDTO dto);
	public boolean deleteProveedor(ProveedorDTO dto);
	public ProveedorDTO updateEstatusProveedor(ProveedorDTO dto);	
	
	public List<?> catProveedorAopSession(ProveedorDTO dto);
	public ProveedorDTO insertProveedorAopSession(ProveedorDTO dto);
	public ProveedorDTO updateProveedorAopSession(ProveedorDTO dto);
	public boolean deleteProveedorAopSession(ProveedorDTO dto);
	public ProveedorDTO updateEstatusProveedorAopSession(ProveedorDTO dto);	

}
