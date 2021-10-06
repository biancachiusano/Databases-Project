package com.to;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Player {

@Id
private int playerId;
private String teamname;
private int age;
private String playername;



public Player(int playerId, String playername, int age, String teamname) {
	this.playerId = playerId;
	this.teamname = teamname;
	this.age = age;
	this.playername = playername;
}

public int getPlayerId() {
	return playerId;
}


public void setPlayerId(int playerId) {
	this.playerId = playerId;
}


public String getTeamname() {
	return teamname;
}


public void setTeamname(String teamname) {
	this.teamname = teamname;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getPlayername() {
	return playername;
}


public void setPlayername(String playername) {
	this.playername = playername;
}


@Override
public String toString() {
	return "Player [playerId=" + playerId + ", teamname=" + teamname + ", age=" + age + ", playername=" + playername
			+ "]";
}



}
