import java.util.* ;

public class CQ04 {
    public static void main(String[]args ) {

        // get input form user
        Scanner Scanner1 = new Scanner(System.in) ;

        // get input value and it assign to variable
        System.out.print("How many manual employes are in the company : ") ;
        int Manual = Scanner1.nextInt() ;

        // get input value and it assign to variable
        System.out.print("How many Skilled employes are in the company : ") ;
        int Skilled = Scanner1.nextInt() ;

        // get input value and it assign to variable
        System.out.print("How many Management employes are in the company : ") ;
        int Management = Scanner1.nextInt() ;


        // Do calulation part of program
        double ManualE = Manual * 500 ;
        double SkilledE = Skilled * 700 ;
        double ManagementE = Management * 800 ;

        // get wage bill value
        double wageBill = ManualE + SkilledE + ManagementE ;


        // calculate tax amout
        double tax = (wageBill * 20 / 100 ) ;


        // print user output
        System.out.println("your totel wage bill amount is (without TAX) : " + wageBill) ;
        System.out.println("TAX you have to pay a ccording to your wage bill : " + tax ) ;
    }
}
