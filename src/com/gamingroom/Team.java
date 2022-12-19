package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author joshua.wozny@snhu.edu, initial code by coce@snhu.edu
 *
 */
public class Team extends Entity{
	
	private List<Player> players;
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
		players = new ArrayList<Player>();
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
		return "Team [id=" + getId() + ", name=" + getName() + "]";
	}
	public Player addPlayer(String name) {

		// a local player instance
		Player player = null;

		// Iterator Pattern is used to make sure that a player with  name does not exist
		// if found, simply return the existing instance
		for(Player pl : players) {
			if(pl.getName()==name){
				return pl;
			}
		}
		// if not found, make a new player instance and add to list of players
		if (player == null) {
			player = new Player(players.size(), name);  //player id will be equal to the index of the players array.
			players.add(player);
		}

		// return the new/existing player instance to the caller
		return player;
	}
}
