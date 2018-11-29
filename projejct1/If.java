package projejct1;

import java.util.Scanner;

//age is less than 16, say "You can't drive."
//age is less than 18, say "You can't vote."
//age is less than 25, say "You can't rent a car."
//age is 25 or over, say "You can do anything that's legal."
public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Hey, what's your name?");
		String name = 
				s.nextLine();
		System.out.print("Ok, "+name+", how old are you?");
		int age = s.nextInt();
		if(age<16)
			System.out.println("age is less than 16, say \"You can't drive\"");
		if(age<17)
			System.out.println("age is less than 18, say \"You can't vote.\"");
		if(age<25)
			System.out.println("age is less than 25, say \"You can't rent a car.\"");
		else
			System.out.println("age is 25 or over, say \"You can do anything that's legal.\"");
	}

}
