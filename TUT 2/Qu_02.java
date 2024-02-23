import java.util.* ;

public class Qu_02 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in) ;

        try {  // this for error handling

        System.out.print ("Enter your age here : ") ;
        int age = scanner1.nextInt();

        if (age >= 18 ) 
        { System.out.print("Over 18"); }
        else if (age >=1 )
        { System.out.print("Under 18"); }
        else 
        { System.out.print("The age enterd is incorrect"); }

        }

        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number."); }

        

    }
}