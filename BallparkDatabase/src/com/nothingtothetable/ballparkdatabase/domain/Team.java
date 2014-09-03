package com.nothingtothetable.ballparkdatabase.domain;

public class Team {
	private int teamSeq;
	private String name;

	public int getTeamSeq() {
		return teamSeq;
	}

	public void setTeamSeq(int teamSeq) {
		this.teamSeq = teamSeq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Team [teamSeq=" + teamSeq + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + teamSeq;
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
		Team other = (Team) obj;
		if (teamSeq != other.teamSeq)
			return false;
		return true;
	}
	
}
