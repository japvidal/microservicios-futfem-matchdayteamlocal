package com.microservicios.app.futfem.matchdayteamlocal.services;

import com.microservicios.app.common.services.CommonService;
import com.microservicios.app.futfem.matchdayteamlocal.models.entity.MatchdayTeamLocal;

public interface MatchdayTeamLocalService extends CommonService<MatchdayTeamLocal>{
	
	public void eliminarDatos();
}
