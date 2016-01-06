/** 
 * A player of a math game. 
 */ 
public class Player { 
	private String name; 
	private int score;
	private int level; 
	/** 
	 * Constructs a Player object. 
	 */ 
	public Player() { 
		name = ""; 
		score = 0; 
		level = 1; 
	} 
	
	/** 
	 * Constructs a Player object with the player's name and initial level. 
	 * @param playerName the player's name 
	 * @param initialLevel the initial level 
	 */ 
	public Player(String playerName, int initialLevel) { 
		name = playerName; 
		score = 0; 
		level = initialLevel; 
	} 
	/** Increments the player's score. 
	 */ 
	public void incrementScore() { 
		score++; 
		if (score % 5 == 0 && level < 3) { 
			level++; 
		} 
	}
	/** Gets the current level. 
	 * @return level the current level
	 */
	public int getLevel() { 
		return level; 
	} 
	
	/** Gets the name of the player. 
	 * @return name the name of the player 
	 */ 
	public String getName() { 
		return name; 
	} 
}
