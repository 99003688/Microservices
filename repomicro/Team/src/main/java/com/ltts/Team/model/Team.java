package com.ltts.Team.model;

public class Team 
{
	private int teamid;
	private String teamname;
	private String owner;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Team(int teamid, String teamname, String owner) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamname=" + teamname + ", owner=" + owner + "]";
	}
	
	
}
