package com.microservicios.app.futfem.matchdayteamlocal.services;

import org.springframework.stereotype.Service;

import com.microservicios.app.common.services.CommonServiceImpl;
import com.microservicios.app.futfem.matchdayteamlocal.models.entity.MatchdayTeamLocal;
import com.microservicios.app.futfem.matchdayteamlocal.models.repository.MatchdayTeamRepository;

@Service
public class MatchdayTeamLocalServiceImpl extends CommonServiceImpl<MatchdayTeamLocal, MatchdayTeamRepository> implements MatchdayTeamLocalService {

	public void eliminarDatos(){
		repository.deleteAll();
	}
}
