import java.util.Scanner;
public class TicTacToe {
	public static void main(String[] args) {
		
		// user input
		Scanner in = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userInput = in.nextInt();
		
		// random number for computer
		int computer = (int)(Math.random() * 3);
		
		// testing
		//System.out.println("you picked " + userInput + " the pc picked " + computer);
		
		// Strings
		String computersMatch = "The computer is ";
		String result = "";	
		String youAre = " You are ";
		
		// Assigning matches
		switch(computer) {
			case 0: computersMatch += "scissor."; break;
			case 1: computersMatch += "rock."; break;
			case 2: computersMatch += "paper."; break;
			default: System.out.println("This should never print"); break;
		}
		switch(userInput) {
			case 0: youAre += "scissor."; break;
			case 1: youAre += "rock."; break;
			case 2: youAre += "paper."; break;
			default: break;
		}
		// validate user input
		if (userInput < 0 || userInput > 2) {
			result += "INVALID INPUT. MUST BE 0, 1 OR 2.";
		} else {
			// If its a draw
			if (userInput == computer) {
				result += computersMatch;
				result += youAre;
				result += " It is a draw";
			} else {			
				// If you are scissor and win
				if (userInput == 0 && computer == 2) {
					result += computersMatch;
					result += youAre;
					result += " You won";
				} else if (userInput == 1 && computer == 0) {
				// if you are rock and win
					result += computersMatch;
					result += youAre;
					result += " You won";
				} else if (userInput == 2 && computer == 1) {
				// If you are paper and win
					result += computersMatch;
					result += youAre;
					result += " You won";
				} else {
				// if you lost
					result += computersMatch;
					result += youAre;
					result += " You lost";
				}
			}		
		}
		System.out.println(result);
	}
}