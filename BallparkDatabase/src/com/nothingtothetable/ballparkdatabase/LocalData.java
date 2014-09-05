package com.nothingtothetable.ballparkdatabase;

import java.util.HashMap;
import java.util.Map;

import com.nothingtothetable.ballparkdatabase.domain.Ballpark;
import com.nothingtothetable.ballparkdatabase.domain.Game;
import com.nothingtothetable.ballparkdatabase.domain.Team;
import com.nothingtothetable.ballparkdatabase.domain.User;

public class LocalData {
	private Map<Integer, User> userMap;
	private Map<Integer, Game> gameMap;
	private Map<Integer, Team> teamMap;
	private Map<Integer, Ballpark> ballparkMap;
	
	public LocalData() {
		this.userMap = new HashMap<Integer, User>();
		this.gameMap = new HashMap<Integer, Game>();
		this.teamMap = new HashMap<Integer, Team>();
		this.ballparkMap = new HashMap<Integer, Ballpark>();
		
		this.addUsers();
		this.addTeams();
		this.addBallparks();
		this.addGames();
	}
	
	private void addUsers() {
		User dan = new User();
		dan.setUserSeq(1);
		dan.setUserName("drmesa");
		dan.setFirstName("Daniel");
		dan.setLastName("Mesa");
		this.userMap.put(dan.getUserSeq(), dan);
	}
	
	private void addTeams() {
		Team marlins = new Team();
		Team braves = new Team();
		marlins.setTeamSeq(1);
		braves.setTeamSeq(2);
		marlins.setName("Miami Marlins");
		braves.setName("Atlanta Braves");
		this.teamMap.put(marlins.getTeamSeq(), marlins);
		this.teamMap.put(braves.getTeamSeq(), braves);
	}
	
	private void addBallparks() {
		Ballpark marlinsBallpark = new Ballpark();
		marlinsBallpark.setBallparkSeq(1);
		marlinsBallpark.setName("Marlins Ballpark");
	}
	
	private void addGames() {
		Game game = new Game();
		game.setGameSeq(1);
		game.setBallparkSeq(1);
		game.setHomeTeamSeq(1);
		game.setVisitingTeamSeq(2);
		game.setLosingTeamSeq(2);
		game.setWinningTeamSeq(1);
	}

	public Map<Integer, User> getUserMap() {
		return userMap;
	}

	public void setUserMap(Map<Integer, User> userMap) {
		this.userMap = userMap;
	}

	public Map<Integer, Game> getGameMap() {
		return gameMap;
	}

	public void setGameMap(Map<Integer, Game> gameMap) {
		this.gameMap = gameMap;
	}

	public Map<Integer, Team> getTeamMap() {
		return teamMap;
	}

	public void setTeamMap(Map<Integer, Team> teamMap) {
		this.teamMap = teamMap;
	}

	public Map<Integer, Ballpark> getBallparkMap() {
		return ballparkMap;
	}

	public void setBallparkMap(Map<Integer, Ballpark> ballparkMap) {
		this.ballparkMap = ballparkMap;
	}
	
}
