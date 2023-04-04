package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_details")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int numbets;
	
	private String game;
	
	private double stake;
	
	private double returns;
	
	private int clientid;
	
	private String date;

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, int numbets, String game, double stake, double returns, int clientid, String date) {
		super();
		this.id = id;
		this.numbets = numbets;
		this.game = game;
		this.stake = stake;
		this.returns = returns;
		this.clientid = clientid;
		this.date = date;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", numbets=" + numbets + ", game=" + game + ", stake=" + stake + ", returns="
				+ returns + ", clientid=" + clientid + ", date=" + date + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNumbets() {
		return numbets;
	}


	public void setNumbets(int numbets) {
		this.numbets = numbets;
	}


	public String getGame() {
		return game;
	}


	public void setGame(String game) {
		this.game = game;
	}


	public double getStake() {
		return stake;
	}


	public void setStake(double stake) {
		this.stake = stake;
	}


	public double getReturns() {
		return returns;
	}


	public void setReturns(double returns) {
		this.returns = returns;
	}


	public int getClientid() {
		return clientid;
	}


	public void setClientid(int clientid) {
		this.clientid = clientid;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	

}
