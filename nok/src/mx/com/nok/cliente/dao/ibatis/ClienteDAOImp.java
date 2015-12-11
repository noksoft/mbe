package mx.com.nok.cliente.dao.ibatis;

import java.util.List;

import mx.com.nok.cliente.dao.ClienteDAO;
import mx.com.nok.cliente.model.dto.ClienteDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ClienteDAOImp extends SqlMapClientDaoSupport implements ClienteDAO {

	@Override
	public List<?> infoCliente(ClienteDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("infoCliente", dto);
	}

	@Override
	public ClienteDTO insertCliente(ClienteDTO dto) throws Exception {
		return (ClienteDTO)this.getSqlMapClientTemplate().queryForObject("insertCliente", dto);
	}

	@Override
	public ClienteDTO updateCliente(ClienteDTO dto) throws Exception {
		return (ClienteDTO)this.getSqlMapClientTemplate().queryForObject("updateCliente", dto);
	}

	@Override
	public boolean deleteCliente(ClienteDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().queryForObject("deleteCliente", dto);
	}

	@Override
	public ClienteDTO updateEstatusCliente(ClienteDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
