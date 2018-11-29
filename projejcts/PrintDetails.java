package projejcts;
import java.util.*;

//Please enter the following information so I can sell it for a profit!
//
//First name: Helena
//Last name: Bonham-Carter
//Grade (9-12): 12
//Student ID: 453916
//Login: bonham_453916
//GPA (0.0-4.0): 3.73
//
//Your information:
//	Login: bonham_453916 
//	ID:    453916 
//	Name:  Bonham-Carter, Helena 
//	GPA:   3.73 
public class PrintDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the following information so I can sell it for a profit!\n");
		System.out.print("FirstName :");
		String name = kb.nextLine();
		System.out.print("LastName :");
		String lName=kb.nextLine();
		System.out.print("Grade (9-12):");
		int grade = kb.nextInt();
		System.out.print("Login :");
		kb.nextLine();
		String login = kb.nextLine();
		
		System.out.println();
		System.out.println("Your information:");
		System.out.println("\t 	Login :"+login);
		System.out.println("\t 	Name : "+name+" "+lName);
		
		

	}

}
