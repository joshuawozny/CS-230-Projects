package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		
		GameService service = GameService.getInstance(); // replace null with ???
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		
		//Test the creation of teams
		Team game1Team1=game1.addTeam("Blue Jays");
		System.out.println(game1Team1);
		Team game1Team2=game1.addTeam("Tigers");
		System.out.println(game1Team2);
		Team game2Team1=game2.addTeam("Tribbles");
		System.out.println(game2Team1);
		Team game2Team2=game2.addTeam("Vulcans");
		System.out.println(game2Team2);
		Team game2Team3=game2.addTeam("Kinglons");
		System.out.println(game2Team3);
		
		//Test the creation of players
		Player team1Player1=game1Team1.addPlayer("Bob");
		System.out.println(team1Player1);
		Player team1Player2=game1Team1.addPlayer("Shelby");
		System.out.println(team1Player2);
		Player team1Player3=game1Team2.addPlayer("Nelson");
		System.out.println(team1Player3);
		Player team2Player1=game1Team2.addPlayer("Abigail");
		System.out.println(team2Player1);
		Player team2Player2=game1Team2.addPlayer("Mike");
		System.out.println(team2Player2);
		
		//Test that multiple teams with same name aren't created
		Team game1Team1Second=game1.addTeam("Blue Jays");
		System.out.print("Already in list: ");
		System.out.println(game1Team1);
		System.out.print("Added to list again: ");
		System.out.println(game1Team1Second);
		
		//Test that multiple players with same name aren't created
		Player team1Player1Second=game1Team1.addPlayer("Bob");
		System.out.print("Already in list: ");
		System.out.println(team1Player1);
		System.out.print("Added to list again: ");
		System.out.println(team1Player1Second);
		
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
		
		
	}
}
