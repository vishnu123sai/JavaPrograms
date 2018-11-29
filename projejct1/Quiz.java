package projejct1;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner s = new Scanner(System.in);){
			System.out.println("Are you ready for a quiz?");
			
			String op = s.nextLine();
			int correct = 0;
			if (op.equals("Yes") || op.equals("yes"))
			{
				
				System.out.println("Okay, here it comes!\n");
				System.out.println("Q1) What is the capital of Alaska?\r\n" + 
						"	1) Melbourne\r\n" + 
						"	2) Anchorage\r\n" + 
						"	3) Juneau");
				int ans=s.nextInt();
				if(ans==3) {
					System.out.println("That's right!");
					correct++;
				}
				else
					System.out.println("That's Wrong!");
				System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\r\n" + 
						"	1) yes\r\n" + 
						"	2) no");
				ans=s.nextInt();
				if(ans==2)
				{
					System.out.println("That's right!");
					correct++;
				}
				else
					System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
			
				System.out.println("Q3) What is the result of 9+6/3?\r\n" + 
						"	1) 5\r\n" + 
						"	2) 11\r\n" + 
						"	3) 15/3");
				ans=s.nextInt();
				if(ans==2) {
					System.out.println("That's right!");
					correct++;
				}
				else
					System.out.println("That's Wrong!");
				
				System.out.println("Overall, you got "+correct+" out of 3 correct.");
				System.out.println("Thanks for playing!");
			
			}
			else
			{
				System.out.println("Thanks! come again and participate");
			}

		}
	}

}
