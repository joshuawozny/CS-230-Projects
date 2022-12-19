package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author joshua.wozny@snhu.edu, intial code by coce@snhu.edu
 *
 */
public class Game extends Entity{
	
	private List<Team> teams;
	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
		teams = new ArrayList<Team>();
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return super.getId();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return super.getName();
	}

	@Override
	public String toString() {
		
		return "Game [id=" + getId() + ", name=" + getName() + "]";
	}
	public Team addTeam(String name) {

		// a local team instance
		Team team = null;

		// Iterator Pattern is used to make sure that a team with  name does not exist
		// if found, simply return the existing instance
		for(Team tm : teams) {
			if(tm.getName()==name){
				return tm;
			}
		}
		// if not found, make a new team instance and add to list of teams
		if (team == null) {
			team = new Team(teams.size(), name);  //team id will be equal to the index of the teams array.
			teams.add(team);
		}

		// return the new/existing team instance to the caller
		return team;
	}
}
