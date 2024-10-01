import java.util.Scanner;
public class mastermind
//Helpppp
	{
		static String [][] board= new String [9][3];
		static String [][] key = new String [1][3];
		public static void main(String[] args)
			{
				prepBoard();
				displayBoard();
				prepKey();
				//greet();
				instructions();
				boolean compete=true;
				while (compete)
					{
				displayBoard();
				selectColor();
					}
			}
		
		
		public static void prepBoard() 
			{ 
				for (int row=0; row<board.length; row++)
				      {
				        for(int col=0; col<board[0].length; col++)
				          {
				            board [row][col]= " ";
				          }
				      }
			}
		public static void displayBoard()
		{
			System.out.print("   1   2   3 ");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();
		    System.out.print("A| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();
		    System.out.print("B| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" |");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();
		    System.out.print("C| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" |");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();
		    System.out.print("D| "+board[3][0]+" | "+board[3][1]+" | "+board[3][2]+" |");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();
		    System.out.print("E| "+board[4][0]+" | "+board[4][1]+" | "+board[4][2]+" |");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();
		    System.out.print("F| "+board[5][0]+" | "+board[5][1]+" | "+board[5][2]+" |");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();	
		    System.out.print("G| "+board[6][0]+" | "+board[6][1]+" | "+board[6][2]+" |");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();
		    System.out.print("H| "+board[7][0]+" | "+board[7][1]+" | "+board[7][2]+" |");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();
		    System.out.print("I| "+board[8][0]+" | "+board[8][1]+" | "+board[8][2]+" |");
		    System.out.println();
		    System.out.print(" -------------");
		    System.out.println();	
		}
		public static void prepKey()
		{
			for(int row=0; row<key.length; row++)
				{
					for (int col=0; col<key[0].length; col++)
						{
							int keyNum = (int) (Math.random() * 6)+1;
							if(keyNum == 1)
								{
									key[row][col]="red";
								}
							else if(keyNum == 2)
								{
									key[row][col]="blue";
								}
							else if (keyNum == 3)
								{
									key[row][col]="yellow";
								}
							else if (keyNum == 4)
								{
									key[row][col]="green";
								}
							else if (keyNum == 5)
								{
									key[row][col]="white";
								}
							else if (keyNum == 6)
								{
									key[row][col]="black";
								}
							
						}
				}
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
					goPlay();
				}
			else if (instruct==2)
				{
				goPlay();	
				}
			
			
		}
		
			
		
		public static void selectColor()
		{
		displayBoard();	
		System.exit(0);
		}

	}
