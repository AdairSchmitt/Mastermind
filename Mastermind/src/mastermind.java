import java.util.Scanner;
public class mastermind
	{

		public static void main(String[] args)
			{
				greet();
				instructions();
				
			}
		public static void greet()
			{
				Scanner userInput = new Scanner (System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello,"+ name + "!");
				instructions();
			}
		public static void instructions()
		{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Would you like to see the Instructions? 1. Yes 2. No");
			int instruct= userInput.nextInt();
			if (instruct==1)
				{
					System.out.println("There will a secret code of 3 colors. (Colors:red, blue, yellow, green, white, black) ");
					System.out.println("The goal of the game is to guess the code of the 3 colors."); 
					System.out.println("When you submit a guess, there will be 3 potential anwsers for each color you guess:");
					System.out.println("1. Right color, right spot");
					System.out.println("2. Right color, wrong spot");
					System.out.println("3. Color is not in code");
					System.out.println("You will get 9 guesses to guess the code.");
				}
			
		}

	}
