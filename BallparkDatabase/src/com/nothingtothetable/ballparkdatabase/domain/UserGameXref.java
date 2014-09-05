package com.nothingtothetable.ballparkdatabase.domain;

public class UserGameXref {
	private int userSeq;
	private int gameSeq;
	
	public int getUserSeq() {
		return userSeq;
	}
	
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	
	public int getGameSeq() {
		return gameSeq;
	}
	
	public void setGameSeq(int gameSeq) {
		this.gameSeq = gameSeq;
	}

	@Override
	public String toString() {
		return "UserGameXref [userSeq=" + userSeq + ", gameSeq=" + gameSeq
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gameSeq;
		result = prime * result + userSeq;
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
		UserGameXref other = (UserGameXref) obj;
		if (gameSeq != other.gameSeq)
			return false;
		if (userSeq != other.userSeq)
			return false;
		return true;
	}
	
	
}
