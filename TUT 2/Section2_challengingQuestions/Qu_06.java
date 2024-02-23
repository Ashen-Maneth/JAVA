import java.util.* ;

public class Qu_06 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in) ;


        try {


        System.out.print("Number of classes held : ") ;
        int NOCH = scanner1.nextInt() ;

        System.out.print("Number of classes attended : ") ;
        int NOCA = scanner1.nextInt() ; 

        double presentage = ((NOCA * 100 )/NOCH ) ; 

        if (presentage >= 75)
        { System.out.println("You will be allowed to sit in exam....") ; }

        else if (presentage >= 0 )
        { System.out.println("Sorry, You will not be allowed to sit in exam...") ;
        System.out.print("If you have medical issue ? (y or n) : ") ;
        String hasMecicalIssue = scanner1.next() ;
    
            if (hasMecicalIssue.equals("y")) 
            {System.out.print("you can access your exam...") ; }}

        else 
        {System.out.print("Enter correct value") ; }

        }

        catch (InputMismatchException e) 
        {System.out.print("Enter correct values ! ") ; }

    
    }

}


