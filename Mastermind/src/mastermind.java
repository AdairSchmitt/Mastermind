import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class mastermind
//no checking of select, it completely crashed
// fix
	{
		static String [][] board= new String [9][4];
		static String [][] key = new String [1][3];
		static int counter=0;
		//static String select, select2, select3 = " ";
		static String [] checkers= new String [3];
		//static String spotKey1, spotKey2, spotKey3=" ";
		public static void main(String[] args)
			{
				prepBoard();
				//displayBoard();
				prepKey();
				
				instructions();
				boolean compete=true;
				while (compete)
					{
				displayBoard();
				selectColor();
				checkSelect();
				//addSelect();
				checkGame();
					}
			}
		
		
		public static void prepBoard() 
			{ 
				for (int row=0; row<board.length; row++)
				      {
				        for(int col=0; col<board[0].length; col++)
				          {
				            board [row][col]= "      ";
				          }
				      }
			}
		public static void displayBoard()
		{
			System.out.print("      1        2        3 ");
		    System.out.println();
		    System.out.print(" ----------------------------");
		    System.out.println();
		    System.out.print("A| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" | "+board [0][3]);
		    System.out.println();
		    System.out.print(" ----------------------------");
		    System.out.println();
		    System.out.print("B| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" | "+board [1][3]);
		    System.out.println();
		    System.out.print(" ----------------------------");
		    System.out.println();
		    System.out.print("C| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" | "+board [2][3]);
		    System.out.println();
		    System.out.print(" ----------------------------");
		    System.out.println();
		    System.out.print("D| "+board[3][0]+" | "+board[3][1]+" | "+board[3][2]+" | "+board [3][3]);
		    System.out.println();
		    System.out.print(" ----------------------------");
		    System.out.println();
		    System.out.print("E| "+board[4][0]+" | "+board[4][1]+" | "+board[4][2]+" | "+board [4][3]);
		    System.out.println();
		    System.out.print(" ----------------------------");
		    System.out.println();
		    System.out.print("F| "+board[5][0]+" | "+board[5][1]+" | "+board[5][2]+" | "+board [5][3]);
		    System.out.println();
		    System.out.print(" ----------------------------");
		    System.out.println();	
		    System.out.print("G| "+board[6][0]+" | "+board[6][1]+" | "+board[6][2]+" | "+board [6][3]);
		    System.out.println();
		    System.out.print(" ----------------------------");
		    System.out.println();
		    System.out.print("H| "+board[7][0]+" | "+board[7][1]+" | "+board[7][2]+" | "+board [7][3]);
		    System.out.println();
		    System.out.print(" ----------------------------");
		    System.out.println();
		    System.out.print("I| "+board[8][0]+" | "+board[8][1]+" | "+board[8][2]+" | "+board [8][3]);
		    System.out.println();
		    System.out.print(" ----------------------------");
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
									key[row][col]="red   ";
								}
							else if(keyNum == 2)
								{
									key[row][col]="blue  ";
								}
							else if (keyNum == 3)
								{
									key[row][col]="yellow";
								}
							else if (keyNum == 4)
								{
									key[row][col]="green ";
								}
							else if (keyNum == 5)
								{
									key[row][col]="white ";
								}
							else if (keyNum == 6)
								{
									key[row][col]="black ";
								}
							System.out.println(key[row][col]);
							
						}
				}
		}

		public static void instructions()
		{
			
			System.out.println("Welcome to Mastermind!");
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
					
			else 
				{
					
				}
			
			
		}
		
		public static void selectColor()
		{
			int selectCount=1;
			for( int i=0; i<board[0].length-1; i++)
				{
			String colors= "1 = red. 2 = blue. 3 = yellow. 4 = green. 5 = white. 6 = black.";
			Scanner user= new Scanner(System.in);
			System.out.println("Choose the color for spot " +selectCount);
			System.out.println(colors);
			int choice= user.nextInt();
			if(choice == 1)
				{
					board [counter][i] ="red   ";
					//select="red";
				}
			else if(choice== 2)
				{
					board[counter][i] ="blue  ";
					//select="blue";
				}
			else if (choice == 3)
				{
					board [counter][i] ="yellow";
					//select="yellow";
				}
			else if (choice == 4)
				{
					board [counter][i] ="green ";
					//select="green";
				}
			else if (choice == 5)
				{
					board [counter][i] ="white ";
					//-select="white";
				}
			else if (choice == 6)
				{
					board [counter][i] ="black ";
					//select="black";
				}
			selectCount++;
				}
			
//			System.out.println("Choose the color for spot 2");
//			System.out.println(colors);
//			int choice2= user.nextInt();
//			if(choice2 == 1)
//				{
//					board [counter][1] ="red   ";
//					select="red";
//				}
//			else if(choice2== 2)
//				{
//					board[counter][1] ="blue  ";
//					select2="blue";
//				}
//			else if (choice2 == 3)
//				{
//					board [counter][1] ="yellow";
//					select2="yellow";
//					
//				}
//			else if (choice2 == 4)
//				{
//					board [counter][1] ="green ";
//					select2="green";
//				}
//			else if (choice2 == 5)
//				{
//					board [counter][1] ="white ";
//					select2="white";
//				}
//			else if (choice2 == 6)
//				{
//					board [counter][1] ="black ";
//					select2="black";
//				}
//			System.out.println("Choose the color for spot 3");
//			System.out.println(colors);
//			int choice3= user.nextInt();
//			if(choice3 == 1)
//				{
//					board [counter][2] ="red   ";
//					select3="red";
//				}
//			else if(choice3== 2)
//				{
//					board[counter][2] ="blue  ";
//					select3="blue";
//				}
//			else if (choice3 == 3)
//				{
//					board [counter][2] ="yellow";
//					select3="yellow";
//				}
//			else if (choice3 == 4)
//				{
//					board [counter][2] ="green ";
//					select3="green";
//				}
//			else if (choice3 == 5)
//				{
//					board [counter][2] ="white ";
//					select3="white";
//				}
//			else if (choice3 == 6)
//				{
//					board [counter][2] ="black ";
//					select3="black";
//				}
			
		
		}
		public static void checkSelect()
		{
			
			
			//SPOT ONE
			// take each spotKey and associate it with a number from count so if count = 0 then = spot key 1 then = answer
			

			
//			//SPOT TWO
//			if(key[0][1].equals(select2))
//				{
//					spotKey2="Correct";
//				}
//			else if(!(key[0][1].equals(select2))&& !(key[0][0].equals(select2)) && !(key[0][2].equals(select2)) )
//				{
//					spotKey2="Wrong";
//				}
//			else if(!(key[0][1].equals(select2))&& (key[0][0].equals(select2)) || (key[0][2].equals(select2)))
//				{
//				spotKey2="Right Color but Wrong Spot";	
//				}
//			
//			//SPOT THREE
//			if(key[0][2].equals(select3))
//				{
//					spotKey3="Correct";
//				}
//			else if(!(key[0][2].equals(select3))&& !(key[0][1].equals(select3)) && !(key[0][0].equals(select3)) )
//				{
//					spotKey3="Wrong";
//				}
//			else if(!(key[0][2].equals(select3))&& (key[0][1].equals(select3)) || (key[0][0].equals(select3)))
//				{
//				spotKey3="Right Color but Wrong Spot";	
//				}
			
			//ArrayList <String> anwsers = new ArrayList<>();
			//anwsers.add(checkers[0]);
			//anwsers.add(checkers[1]);
			//anwsers.add(checkers[2]);
			//Collections.shuffle(anwsers);
			board[counter][3]= ("Anwsers, in no order: "+ checkers[0]+ checkers[1]+ checkers[2]);
			counter++;
			
		}
		
		public static void checkGame()
		{
		if(checkers[0].equals("Correct") && checkers[1].equals("Correct") && checkers[2].equals("Correct"))
			{
				System.out.println("You Win!");
				System.exit(0);
			}
		}

	}
//for (int j =0; j<checkers.length; j++)
//{
//	System.out.println("j = " + j);
//	for (int i=0; i<board[0].length-1; i++)
//	{
//		System.out.println("i = " + i);
//		for (int col=0; col<key[0].length; col++)
//			{
//				System.out.println("col = " + col);	
//		if(key[0][col].equals(board[counter][i]))
//			{
//				checkers[j]="Correct";
////				System.out.println(key[0][col]+board [counter][i]);
////				System.out.println("corrects");
//			}
//		else if(!(key[0][col].equals(board[counter][i])) && (key[0][col].contains(board[counter][i])) )
//				{
//					checkers[j]="Right Color but Wrong Spot";
////					System.out.println(key[0][col]+board [counter][i]);
////					System.out.println("right wrong place");
//				}
//		else if(!(key[0][col].contains(board[counter][i]))  )
//						{
//							checkers[j]="Wrong";
////							System.out.println(key[0][col]+board [counter][i]);
////							System.out.println("wrong");
//						}
//			}
//				
//	}
//}

