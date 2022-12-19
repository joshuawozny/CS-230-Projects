package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author joshua.wozny@snhu.edu : original base file by coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		
		GameService service = GameService.getInstance(); // gets the singleton instance
		
		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
