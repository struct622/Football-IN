package com.spring.domain;

import java.util.Date;

public class TeamVO {
	private Integer tno;
	private String mid;
	private String teamname;
	private String location;
	private int person;
	private Date regdate;
	private int win;
	private int draw;
	private int lose;
	private int totalgoals;
	private int goalconceded;
	
	public Integer getTno() {
		return tno;
	}
	public void setTno(Integer tno) {
		this.tno = tno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getTotalgoals() {
		return totalgoals;
	}
	public void setTotalgoals(int totalgoals) {
		this.totalgoals = totalgoals;
	}
	public int getGoalconceded() {
		return goalconceded;
	}
	public void setGoalconceded(int goalconceded) {
		this.goalconceded = goalconceded;
	}
	@Override
	public String toString() {
		return "TeamVO [tno=" + tno + ", mid=" + mid + ", teamname=" + teamname + ", location=" + location + ", person="
				+ person + ", regdate=" + regdate + ", win=" + win + ", draw=" + draw + ", lose=" + lose
				+ ", totalgoals=" + totalgoals + ", goalconceded=" + goalconceded + "]";
	}
	
	
}
