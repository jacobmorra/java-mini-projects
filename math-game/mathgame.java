import java.util.Scanner; 
import java.util.InputMismatchException; 
import java.util.Random;

/** 
 * Play a math game. 
 */
public class MathGame {
	private Player player;//declare new Player instance called player 
	private Scanner in; //declare new Scanner instance called in
	
	/** 
	 * Construct a MathGame object. 
	 */ 
	public MathGame(){
		player = new Player(); //initialize new Player instance called player
		in = new Scanner(System.in); //initialize new Scanner instance called in
	}
	
	/** 
	 * Plays the game. 
	 */ 
	public void play() {
		readPlayerInformation(); 
		String response = ""; 
		boolean done = false; 
		while (!done) { 
			playRound(); 
			System.out.print("Do you want to play again? (Y/N) "); 
			response = in.next(); 
			
			if (!response.equalsIgnoreCase("y")) { 
				done = true; 
			} 
		}
	}
	
	/** 
	 * Reads user information.. starts user at desired level with name
	 */ 
	public void readPlayerInformation() { 
		String name = ""; 
		System.out.print("What is your name? "); 
		name = in.next(); 
		int initialLevel = 0; 
		boolean done = false; 
		while (!done) { 
			System.out.print("At what level do you want to start? (1-3) ");
		
			try { 
				initialLevel = in.nextInt(); 
				if (initialLevel >= 1 && initialLevel <= 3) { 
					done = true; 
				}
			}
			catch (InputMismatchException e){
				in.next(); // read the newline character 
				System.out.println("Please, enter a number between 1 and 3.");
			}
		}
		//set player name and initial level based on input
		player = new Player(name, initialLevel);
		
	}
	
	/** 
	 * Plays one round of the game. 
	 */ 
	public void playRound() { 
		int i1 = 0; 
		int i2 = 0; 
		int answer = 0; 
		Random generator = new Random(); 
		if (player.getLevel() == 1) { 
			boolean done = false; 
			while (!done) { 
				i1 = generator.nextInt(9) + 1; 
				i2 = generator.nextInt(9) + 1; 
				answer = i1 + i2; 
				if (answer < 9) { 
					done = true; 
				} 
			} 
			System.out.print("What is " + i1 + " + " + i2 + " ? "); 
		}
		else if (player.getLevel() == 2) {
			i1 = generator.nextInt(9) + 1; 
			i2 = generator.nextInt(9) + 1; 
			answer = i1 + i2; 
			System.out.print("What is " + i1 + " + " + i2 + " ? ");
		}
		if (player.getLevel() == 3) { 
			boolean done = false; 
			while (!done) { 
				i1 = generator.nextInt(9) + 1;
				i2 = generator.nextInt(9) + 1; 
				answer = i2 - i1; 
				if (answer > 0) { 
					done = true; 
				} 
			} 
			System.out.print("What is " + i2 + " - " + i1 + " ? "); 
		} 
		System.out.println(getResults(answer));
	}
	
	/** 
	 * Gets the results of the play. 
	 * @param answer the answer key 
	 * @return the results 
	 */ 
	public String getResults(int answer) { 
		int guess = getGuess(); 
		if (answer != guess) { 
			System.out .println("Sorry, that is incorrect. Please try one more time."); 
			guess = getGuess();
		}
		String result = ""; 
		if (answer == guess) { 
			result = "Congratulations, " + player.getName() + "! That is correct."; 
			player.incrementScore(); 
		} 
		else { 
			result = "Sorry, " + player.getName() + ". The correct answer is " + answer; 
		} 
			return result; 
	}
	
	
	
	/** Gets the guess from the player. 
	 * @param the guess from the player 
	 */ 
	public int getGuess() { 
		int guess = 0;
		boolean done = false; 
		String input = ""; 
		while (!done) { 
			try { 
				if (player.getLevel() == 3) { 
					System.out.print("Please enter the difference: "); 
					guess = in.nextInt(); 
				} 
				else {
					System.out.print("Please enter the sum: "); 
					guess = in.nextInt(); 
				} 
				if (guess > 0) { 
					done = true; 
				} 
			} 
			catch (InputMismatchException e) { 
				in.next(); // read the newline character 
				System.out.println("The response must be a number."); 
			} 
		} 
		return guess; 
	} 	
}
