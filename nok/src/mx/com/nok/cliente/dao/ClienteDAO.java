package mx.com.nok.cliente.dao;

import java.util.List;

import mx.com.nok.cliente.model.dto.ClienteDTO;

public interface ClienteDAO {
	
	public List<?> infoCliente(ClienteDTO dto) throws Exception;
	public ClienteDTO insertCliente(ClienteDTO dto) throws Exception;
	public ClienteDTO updateCliente(ClienteDTO dto) throws Exception;
	public boolean deleteCliente(ClienteDTO dto) throws Exception;
	public ClienteDTO updateEstatusCliente(ClienteDTO dto) throws Exception;
}
