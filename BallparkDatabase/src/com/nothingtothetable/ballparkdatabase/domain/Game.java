package com.nothingtothetable.ballparkdatabase.domain;

public class Game {
	private int gameSeq;
	private int homeTeamSeq;
	private int visitingTeamSeq;
	private int winningTeamSeq;
	private int ballparkSeq;
	
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

	public int getVisitingTeamSeq() {
		return visitingTeamSeq;
	}

	public void setVisitingTeamSeq(int visitingTeamSeq) {
		this.visitingTeamSeq = visitingTeamSeq;
	}

	public int getWinningTeamSeq() {
		return winningTeamSeq;
	}

	public void setWinningTeamSeq(int winningTeamSeq) {
		this.winningTeamSeq = winningTeamSeq;
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

	@Override
	public String toString() {
		return "Game [gameSeq=" + gameSeq + ", homeTeamSeq=" + homeTeamSeq
				+ ", visitingTeamSeq=" + visitingTeamSeq + ", winningTeamSeq="
				+ winningTeamSeq + ", ballparkSeq=" + ballparkSeq
				+ ", losingTeamSeq=" + losingTeamSeq + "]";
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
