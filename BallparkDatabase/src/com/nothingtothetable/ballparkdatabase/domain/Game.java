package com.nothingtothetable.ballparkdatabase.domain;

import java.sql.Timestamp;

public class Game {
	private int gameSeq;
	private int homeTeamSeq;
	private int awayTeamSeq;
	private String outcomeFlag;
	private int ballparkSeq;
	private Timestamp startTime;
	
	private int losingTeamSeq;

	public int getGameSeq() {
		return gameSeq;
	}

	public void setGameSeq(int gameSeq) {
		this.gameSeq = gameSeq;
	}

	public int getHomeTeamSeq() {
		return homeTeamSeq;
	}

	public void setHomeTeamSeq(int homeTeamSeq) {
		this.homeTeamSeq = homeTeamSeq;
	}

	public int getAwayTeamSeq() {
		return awayTeamSeq;
	}

	public void setAwayTeamSeq(int awayTeamSeq) {
		this.awayTeamSeq = awayTeamSeq;
	}

	public String getOutcomeFlag() {
		return outcomeFlag;
	}

	public void setOutcomeFlag(String outcomeFlag) {
		this.outcomeFlag = outcomeFlag;
	}

	public int getLosingTeamSeq() {
		return losingTeamSeq;
	}

	public void setLosingTeamSeq(int losingTeamSeq) {
		this.losingTeamSeq = losingTeamSeq;
	}

	public int getBallparkSeq() {
		return ballparkSeq;
	}

	public void setBallparkSeq(int ballparkSeq) {
		this.ballparkSeq = ballparkSeq;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		return "Game [gameSeq=" + gameSeq + ", homeTeamSeq=" + homeTeamSeq
				+ ", awayTeamSeq=" + awayTeamSeq + ", outcomeFlag="
				+ outcomeFlag + ", ballparkSeq=" + ballparkSeq
				+ ", startTime=" + startTime + ", losingTeamSeq="
				+ losingTeamSeq + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gameSeq;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (gameSeq != other.gameSeq)
			return false;
		return true;
	}
	
}
