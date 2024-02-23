import java.util.* ;

public class Qu_03 {
    public static void main(String[]  args ) {

        Scanner scanner1 = new Scanner(System.in) ;


        try {
         // get ICT marks from user
        System.out.print("Enter your ICT markes : ");
        double ICTMarks = scanner1.nextDouble() ;

        // get CW marks form user
        System.out.print("Enter your CW marks : ") ;
        double CWMarks = scanner1.nextDouble() ; 

        if (ICTMarks >= 40 && CWMarks >= 40 )
        { double Finalmark = ((ICTMarks + CWMarks)/2) ; 
        System.out.print("You pass the module and you got " + Finalmark + " scores") ; }

        else 
        {System.out.print("sorry you faill this module") ; }


        } 

        catch (InputMismatchException e )
        {System.out.print("Enter correct value ! ") ; }
        
    }
}