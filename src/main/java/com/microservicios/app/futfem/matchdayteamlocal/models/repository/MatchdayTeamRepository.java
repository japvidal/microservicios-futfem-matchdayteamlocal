package com.microservicios.app.futfem.matchdayteamlocal.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.futfem.matchdayteamlocal.models.entity.MatchdayTeamLocal;

public interface MatchdayTeamRepository extends CrudRepository<MatchdayTeamLocal, Long> {

	
}
