package com.microservicios.app.futfem.matchdayteamlocal.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.app.common.controllers.CommonController;
import com.microservicios.app.futfem.matchdayteamlocal.models.entity.MatchdayTeamLocal;
import com.microservicios.app.futfem.matchdayteamlocal.services.MatchdayTeamLocalService;

@RestController
public class MatchdayTeamLocalController extends CommonController<MatchdayTeamLocal, MatchdayTeamLocalService> {
	
	@DeleteMapping("/")
	public ResponseEntity<?> eliminarDatos(){
		service.eliminarDatos();
		return ResponseEntity.noContent().build(); // HTTPStatus 204
	}
}
