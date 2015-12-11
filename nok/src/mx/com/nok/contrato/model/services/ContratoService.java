package mx.com.nok.contrato.model.services;

import java.util.List;

import mx.com.nok.contrato.model.dto.ContratoDTO;

public interface ContratoService {

	public List<?> catContratoAopSession(ContratoDTO dto);
	public ContratoDTO insertContratoAopSession(ContratoDTO dto);
	public ContratoDTO updateContratoAopSession(ContratoDTO dto);
	public boolean deleteContratoAopSession(ContratoDTO dto);
	public ContratoDTO updateEstatusContratoAopSession(ContratoDTO dto);
	
	public List<?> catContrato(ContratoDTO dto);
	public ContratoDTO insertContrato(ContratoDTO dto);
	public ContratoDTO updateContrato(ContratoDTO dto);
	public boolean deleteContrato(ContratoDTO dto);
	public ContratoDTO updateEstatusContrato(ContratoDTO dto);
}
