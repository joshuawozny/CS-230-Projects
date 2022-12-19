/**
 * 
 */
package com.gamingroom;

/**
 * @author joshua.wozny@snhu.edu 
 *
 */

public abstract class Entity {
	private long id;
	private String name;
	//protected standard constructor
	protected Entity() {
		
	}
	//public constructor
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return this.name + " Id " + this.id;
	}
}
