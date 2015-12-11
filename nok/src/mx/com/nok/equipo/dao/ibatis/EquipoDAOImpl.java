package mx.com.nok.equipo.dao.ibatis;

import java.util.List;

import mx.com.nok.equipo.dao.EquipoDAO;
import mx.com.nok.equipo.model.dto.EquipoDTO;
import mx.com.nok.equipo.model.dto.MarcaMotorDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EquipoDAOImpl   extends SqlMapClientDaoSupport implements EquipoDAO {

	
	public List<?> infoEquipo(EquipoDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
				queryForList("infoEquipo",dto);
	}

	public EquipoDTO insertEquipo(EquipoDTO dto) throws Exception {
		if(dto.getMarcamotor() != "" && dto.getMarcamotor() != "0"){
			return (EquipoDTO)this.getSqlMapClientTemplate().queryForObject("insertEquipo",dto);			
		}else{
			return (EquipoDTO)this.getSqlMapClientTemplate().queryForObject("insertEquipoWhioutMarcaMotor", dto);
		}
	}

	
	public EquipoDTO updateEquipo(EquipoDTO dto) throws Exception {
		if(dto.getMarcamotor() != "" && dto.getMarcamotor() != "0"){
			return (EquipoDTO)this.getSqlMapClientTemplate().queryForObject("updateEquipo",dto);			
		}else{
			return (EquipoDTO)this.getSqlMapClientTemplate().queryForObject("updateEquipoWhioutMarcamotor", dto);
		}
	}

	
	public boolean deleteEquipo(EquipoDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteEquipo",dto);
	}

	
	public EquipoDTO updateEstatusEquipo(EquipoDTO dto) throws Exception {
		return (EquipoDTO)this.getSqlMapClientTemplate().
				queryForObject("updateEstatusEquipo",dto);
	}
	
	//Servicio que regresa la lista de marcas de motor
	public List<?> infoMarcasMotor(MarcaMotorDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("infoMarcaMotor", dto);
	}


	@Override
	public MarcaMotorDTO insertMarcamotor(MarcaMotorDTO dto) throws Exception {
		return (MarcaMotorDTO)this.getSqlMapClientTemplate().queryForObject("insertMarcamotor", dto);
	}


	@Override
	public MarcaMotorDTO updateMarcamotor(MarcaMotorDTO dto) throws Exception {
		return (MarcaMotorDTO)this.getSqlMapClientTemplate().queryForObject("updateMarcamotor", dto);
	}


	@Override
	public boolean deleteMarcamotor(MarcaMotorDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteMarcamotor",dto);
	}
	
}
