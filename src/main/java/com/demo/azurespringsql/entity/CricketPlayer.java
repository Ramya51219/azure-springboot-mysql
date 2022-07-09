package com.demo.azurespringsql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CricketPlayer{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int playertype;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the player_type
	 */
	public int getPlayertype() {
		return playertype;
	}
	/**
	 * @param playertype the playertype to set
	 */
	public void setPlayer_type(int playertype) {
		this.playertype = playertype;
	}
	public CricketPlayer(int id, String name, int playertype) {
		super();
		this.id = id;
		this.name = name;
		this.playertype = playertype;
	}
	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}