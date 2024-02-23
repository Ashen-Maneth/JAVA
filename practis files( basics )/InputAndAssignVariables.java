import java.util.*;

// for get input you have to import this 

public class InputAndAssignVariables{
	public static void main (String[]args) {
		
		// this is for a creagt variable and assign input values
		
		System.out.print("\n");

		Scanner x = new Scanner(System.in);  // for get input as a x
		System.out.print("enter your name : ") ;
		String Name = x.next(); // x assing to Name as a string

		Scanner y = new Scanner(System.in); // for get a input as a y		
		System.out.print("Enter your age here : ");
		int Age = y.nextInt(); // y assing to Age as a intiger 		
		
		
		// we have to use for string to " nextLine " and for intiger to " nextInt " like this 
		
		System.out.print("you name is " + Name + " and your age is " + Age + " years old. ");
		System.out.print("\n");
		
	}
}
		
	

		
		
		