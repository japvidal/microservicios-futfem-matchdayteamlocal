package com.microservicios.app.futfem.matchdayteamlocal.models.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="matchday_team_local")
public class MatchdayTeamLocal {
	
	@Id
	private Long id;
	
	private String name;
	private String country;
	private String nickname;
	private String urlpic;
	private String urlshirt;
	@Column(name = "established")
	private Date established;
	
	private int moral;
	private int agresividad;
	private int ataque;
	private int posesion;
	private int defensa;
	private int goles;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUrlpic() {
		return urlpic;
	}
	public void setUrlpic(String urlpic) {
		this.urlpic = urlpic;
	}
	public String getUrlshirt() {
		return urlshirt;
	}
	public void setUrlshirt(String urlshirt) {
		this.urlshirt = urlshirt;
	}
	public Date getEstablished() {
		return established;
	}
	public void setEstablished(Date established) {
		this.established = established;
	}
	public int getMoral() {
		return moral;
	}
	public void setMoral(int moral) {
		this.moral = moral;
	}
	public int getAgresividad() {
		return agresividad;
	}
	public void setAgresividad(int agresividad) {
		this.agresividad = agresividad;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getPosesion() {
		return posesion;
	}
	public void setPosesion(int posesion) {
		this.posesion = posesion;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	
}
