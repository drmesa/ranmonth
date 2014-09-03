package com.nothingtothetable.ballparkdatabase.domain;

public class Ballpark {
	private int ballparkSeq;
	
	private String name;

	public int getBallparkSeq() {
		return ballparkSeq;
	}

	public void setBallparkSeq(int ballparkSeq) {
		this.ballparkSeq = ballparkSeq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ballpark [ballparkSeq=" + ballparkSeq + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ballparkSeq;
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
		Ballpark other = (Ballpark) obj;
		if (ballparkSeq != other.ballparkSeq)
			return false;
		return true;
	}
	
}
