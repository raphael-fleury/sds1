package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dspesquisa.entities.Record;
import com.devsuperior.dspesquisa.entities.enums.Platform;

public class RecordDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant moment;
	private String name;
	private int age;
	private String gameTitle;
	private Platform gamePlatform;
	private String genreName;

	// Constructors
	public RecordDTO() { }

	public RecordDTO(Record record) {
		id = record.getId();
		moment = record.getMoment();
		name = record.getName();
		age = record.getAge();
		gameTitle = record.getGame().getTitle();
		gamePlatform = record.getGame().getPlatform();
		genreName = record.getGame().getGenre().getName();
	}
	
	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public Platform getGamePlatform() {
		return gamePlatform;
	}

	public void setGamePlatform(Platform gamePlatform) {
		this.gamePlatform = gamePlatform;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
