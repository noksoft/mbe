/**
 * Creado por Carlos Zaragoza
 */
package mx.com.nok.contrato.model.business;

import java.io.Serializable;
import java.util.List;

import flex.messaging.io.ArrayList;

import mx.com.nok.contrato.dao.ContratoDAO;
import mx.com.nok.contrato.model.dto.ContratoDTO;
import mx.com.nok.contrato.model.services.ContratoService;

public class ContratoBusiness implements ContratoService, Serializable {

	private static final long serialVersionUID = 1L;
	private ContratoDAO contratoDAO;
	public ContratoDAO getContratoDAO() {
		return contratoDAO;
	}

	public void setContratoDAO(ContratoDAO contratoDAO) {
		this.contratoDAO = contratoDAO;
	}

	@Override
	public List<?> catContratoAopSession(ContratoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContratoDTO insertContratoAopSession(ContratoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContratoDTO updateContratoAopSession(ContratoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContratoAopSession(ContratoDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ContratoDTO updateEstatusContratoAopSession(ContratoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> catContrato(ContratoDTO dto) {
		List <?> list = new ArrayList();
		try{
			list = contratoDAO.infoContrato(dto);
		}catch(Exception e){
			e.printStackTrace();
			list = null;
		}
		return list;
	}

	@Override
	public ContratoDTO insertContrato(ContratoDTO dto) {
		try{
			return contratoDAO.insertContrato(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ContratoDTO updateContrato(ContratoDTO dto) {
		try{
			return contratoDAO.updateContrato(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteContrato(ContratoDTO dto) {
		try{
			return contratoDAO.deleteContrato(dto);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ContratoDTO updateEstatusContrato(ContratoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
