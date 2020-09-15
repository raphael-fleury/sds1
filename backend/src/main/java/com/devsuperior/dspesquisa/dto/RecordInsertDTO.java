package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

public class RecordInsertDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private long gameId;

	//Constructors
	public RecordInsertDTO() {}
	
	public RecordInsertDTO(String name, int age, long gameId) {
		this.gameId = gameId;
		this.name = name;
		this.age = age;
	}

	//Getters and Setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }

	public long getGameId() { return gameId; }
	public void setgameId(long gameId) { this.gameId = gameId; }
		
}
