import java.util.* ; 

public class Qu_01 {
    public static void main(String [] args) {

        // get input from user 
        Scanner scanner1 = new Scanner(System.in) ;

        // desplay input text
        System.out.print("Enter your first number here : ") ;
        double num1 = scanner1.nextDouble() ;

        System.out.print("Enter your second number here : " ) ;
        double num2 = scanner1.nextDouble() ; 

        // get sum of to numbers
        double sum = num1 + num2 ;

        // print output
        System.out.print("Sum of these two numbers : " + sum) ;

    }
}


