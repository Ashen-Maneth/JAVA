import java.util.* ; 

public class Qu_04 {
    public static void main(String[] args ) {

        Scanner scanner1 = new Scanner(System.in) ; 

        try {
            // intilize varables
            boolean answer = true ;
            String useranswer = "" ;

            while (answer) // use while loop for continue programm 
            
            {
            System.out.print("Enter your score here : ") ; // get input form user
            int score = scanner1.nextInt() ;

            // calulate the class
            if (score >= 100 ) 
            { System.out.println("Invalied value ! ") ; }

            else if (score >= 70 )
            {System.out.println("1st class honours (1)") ; }

            else if ( score >= 60 )
            {System.out.println("2nd class horours (2:i)") ; }

            else if ( score >= 50 )
            {System.out.println("2nd class horours (2:ii)") ; }

            else if ( score >= 40 )
            {System.out.println("3rd class honours (3)") ; }

            else
            {System.out.println("invailed input ! ") ; }

            do // this is like "Do this while that conditino true"
            {
                System.out.print("Do you want to enter another score ? (y or n ) : ") ;
                useranswer = scanner1.next();
            } while (!useranswer.equals("n") && !useranswer.equals("y"));

            if (useranswer.equals("n"))
            {
                answer = false ;
            }
        }
    
    } 
    catch (InputMismatchException e) 
    {
        System.out.println("Enter valid input ! ");
    }

}
}
