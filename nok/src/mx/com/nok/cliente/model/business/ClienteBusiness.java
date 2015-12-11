package mx.com.nok.cliente.model.business;

import java.io.Serializable;
import java.util.List;

import mx.com.nok.cliente.dao.ClienteDAO;
import mx.com.nok.cliente.model.dto.ClienteDTO;
import mx.com.nok.cliente.model.service.ClienteService;
import flex.messaging.io.ArrayList;

public class ClienteBusiness implements Serializable, ClienteService {

	private static final long serialVersionUID = 1L;
	
	private ClienteDAO clienteDAO;

	@Override
	public List<?> catClientes(ClienteDTO dto) {
		List <?> list = new ArrayList();
		try{
			list = clienteDAO.infoCliente(dto);
		}catch(Exception e){
			e.printStackTrace();
			list = null;
		}
		return list;
	}

	@Override
	public ClienteDTO insertCliente(ClienteDTO dto) {
		try{
			return clienteDAO.insertCliente(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ClienteDTO updateCliente(ClienteDTO dto) {
		try{
			return clienteDAO.updateCliente(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteCliente(ClienteDTO dto) {
		try{
			return clienteDAO.deleteCliente(dto);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ClienteDTO updateClienteDTO(ClienteDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

}
