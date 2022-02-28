package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// FIXME: obtain local reference to the singleton instance
		GameService service = GameService.getInstance(); // replace null with gameService.getInstance. Below is further explanation of the purpose/characteristics of the singleton pattern.
		
		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}

// The Singleton pattern is used in a singular instance when a "class" is present. I like to remember that an "instance" is equivalent to an "object". Keeping this in the back of my head minimizes any confusion(for myself).
// You can identify an instance within a class, for example in our GameService class we have a few different instances noted. The instance will hold the memory for each class, by doing so this will allow each new object to gain its own "brain" for their variables. 
// An example I always remember is if you have two students and you title them "student1" and "student2" you have then created two instances so then they have the capability of storing their own "brain". 
// To note; this is done outside of a method or construct  but inside a class. However, the singleton is used as a control point for each object that is created. Hence, only one singleton instance objects inside will only happen a single time within a class. 