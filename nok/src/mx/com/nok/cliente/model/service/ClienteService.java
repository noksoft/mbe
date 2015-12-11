package mx.com.nok.cliente.model.service;

import java.util.List;
import mx.com.nok.cliente.model.dto.ClienteDTO;

public interface ClienteService {
	
	public List<?> catClientes(ClienteDTO dto);
	public ClienteDTO insertCliente(ClienteDTO dto);
	public ClienteDTO updateCliente(ClienteDTO dto);
	public boolean deleteCliente(ClienteDTO dto);
	public ClienteDTO updateClienteDTO(ClienteDTO dto);

}
