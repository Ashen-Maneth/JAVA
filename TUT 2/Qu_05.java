import java.util.* ;

public class Qu_05 {

    public static void main(String[] args ) {

        Scanner scanner1 = new Scanner(System.in) ;

        try 
        {
            double answer = 0 ;
            boolean nextcon = true ;
            String x = " " ;

            System.out.println ("\nWelcome my calculater programm") ;

         while (nextcon) // nextcon is alrady boolinya then no need to cide like this --> "nextcon == true"

        {
        

        System.out.print("\nEnter first number : ") ;
        double number1 = scanner1.nextDouble() ;

        System.out.print("Enter your second number : ") ;
        double number2 = scanner1.nextDouble() ;
        

        System.out.print("\nEnter oparation as you want (+ , - , * , / ) : ") ;
        String oparation = scanner1.next();

        if (oparation.equals("+"))
        {answer = number1 + number2 ; }

        else if (oparation.equals("-"))
        {answer = number1 - number2 ; }

        else if (oparation.equals("*"))
        {answer = number1 * number2 ; }

        else if (oparation.equals("/"))
        {answer = number1 / number2 ; }

        else 
        {System.out.print("invalid oparation ! ") ; }


        System.out.println(" \nyour answer is " + number1 + " " + oparation + " " + number2 + " = " + answer ) ;

        do 
        {
            System.out.print("\nDo you want to continue this (y or n) : ") ;
        x = scanner1.next() ; }

        while (!x.equals("y") && !x.equals("n")) ;

        if (x.equals("n"))
        {nextcon = false ;}

    

        }
    }

        catch (InputMismatchException e )
        {System.out.print("Enter valied answer !") ;}
        catch (ArithmeticException e)
        {System.out.print("cant devide by Zero") ; }




    }

}