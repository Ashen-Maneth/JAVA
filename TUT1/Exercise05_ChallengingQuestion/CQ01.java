import java.util.Scanner;

public class CQ01 {
    public static void main(String[] args ) {

        Scanner scanner1 = new Scanner(System.in) ;

        System.out.print("Enter your first name here : ");
        String firstName = scanner1.next();

        System.out.print("Enter your surname here : ") ;
        String surname = scanner1.next();

        String firstletter = firstName.substring(0,1) ;
        String secondletter = surname.substring(0, 1) ;

        System.out.print("initials of your name : " + firstletter + " . " + secondletter ) ;
        



    }
}

