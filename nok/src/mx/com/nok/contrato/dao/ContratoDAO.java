package mx.com.nok.contrato.dao;

import java.util.List;

import mx.com.nok.contrato.model.dto.ContratoDTO;

public interface ContratoDAO {

	public List<?> infoContrato(ContratoDTO dto) throws Exception;
	public ContratoDTO insertContrato(ContratoDTO dto) throws Exception;
	public ContratoDTO updateContrato(ContratoDTO dto)throws Exception;
	public boolean deleteContrato(ContratoDTO dto) throws Exception;
	public ContratoDTO updateEstatusContrato(ContratoDTO dto)throws Exception;
	
}
