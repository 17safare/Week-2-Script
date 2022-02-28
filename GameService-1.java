package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	// FIXME: Add missing pieces to turn this class a singleton 
	private static GameService instance = new GameService();  //first, making sure the class is a private constructor. this makes sure that it is referring to a specific object 

	private void GameService() {
		if(instance == null) {          // static field is created when set to null. the reason this occurs because it's a way of having access to the instance that was noted on line 24. We make sure setting it to create an object
			instance = new GameService();
	}
	}
		public static GameService getInstance() {  // we HAVE to make the getInstance public so we can return it successfully. 
			return instance; // here we return the singleton object 
	}
	

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		Iterator<Game> gamesIterator = games.iterator();  // iterator was created for Game
			while(gamesIterator.hasNext()) {   // here we create a Loop that will use the hasNext and Next methods that the Iterator has. 
			  game gameInstance = gamesIterator.next(); // next() method is used 
				if(game.getName().equalsIgnoreCase(name));  //we use equalsIgnoreCase because this will return the boolean value, if the item is not nulled it'll be true, anything different will be false. '
				    return gameInstance;  // Last step of the iterator is to return the instance that was created above. 
	}
	}
		// if not found, make a new game instance and add to list of games
		if (game == null) {   
			game = new Game(nextGameId++, name);     // I left this as provided with the original script. 
			games.add(game);
	}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
	Iterator <Game> gamesIterator = game.iterator();  // Iterator is initiated for getGame
	while(gamesIterator.hasNext()) {   //using the appropriate hasNext() methods as iterators require. Above has a more in-depth explanation
		game gameInstance = gamesIterator.next(); //using the next() method for the iterator, 
		if (gameInstance.getId() == (id) { // We set "==" to id because this is checking that the two variables are sharing the same memory location. Do not confuse this with .equals as i had previously, that compress is two objects are similar or not.
			return gameInstance;  //end iterator/instance by returning 
	}
	}
		return game; // end of getGame (id)
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
	Iterator<Game> gamesIterator = games.iterator();  //iterator is started 
	  while (gamesIterator.hasNext()) {  //hasNext() method is initiated, since there is not next element to return to in the iteration  we do not use the next() 
		if(gamesInstance.getName().equalsIgnoreCase(name)) {  // as stated above, we use equalsIgnoreCase as stated on line 52. 
			game = gameInstance; 
	}
	}
		return game;  //closing iterator by returning to getGame string. 
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}

//The purpose we use iterators multiple times in this ArrayList script because each object within the class holds memory.  An iterator will contribute by when its called each time, it'll print out the instances values.
// The reason we use the hasNext method is because this will tells use if there are any other values that need to be printed, same reason the next method is used. 
// Overall, an iterator will check multiple objects one at a time. Characteristics like the hasNext and next methods are used to check for the objects. 