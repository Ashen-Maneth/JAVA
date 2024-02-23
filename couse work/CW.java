import java.util.* ;

public class CW{

    static String[][]seat = seatArray() ; //  define the seat array outside the main method (otherwise second round X again replace to O)

    public static void main(String[] args) {
        String userAnswer = "y" ;
        int UserInput = 0 ;
        Scanner scanner = new Scanner(System.in) ; // get scanner for inputs

        try 
        {
            System.out.println("\n\n\n                                             ~~~~ WELCOME TO THE PLANE MANAGEMENT APLICATION ~~~~") ;

        while (userAnswer.equals("y")) {
        

        

        

        System.out.println("\n\n       *************************************************************************************************************************************");
        System.out.println("       *                                                        MENU OPTIONS                                                               *");
        System.out.println("       *************************************************************************************************************************************");
        System.out.println("\n            1)  Buy a seat                                                                                                             ");
        System.out.println("\n            2)  Cancel a seat                                                                                                          ");
        System.out.println("\n            3)  Find first avaliable seat                                                                                              ");
        System.out.println("\n            4)  Show seating plan                                                                                                      ");
        System.out.println("\n            5)  Print tickets information and total sales                                                                              ");
        System.out.println("\n            6)  Search tiket                                                                                                           ");
        System.out.println("\n            0)  Quit                                                                                                                   ");
        System.out.println("\n       *************************************************************************************************************************************") ;

        do
        { System.out.print("\n\nPlease select an option : ") ;
        UserInput = scanner.nextInt();  }

        while(UserInput != 0 && UserInput != 1 && UserInput != 2 && UserInput != 3 && UserInput != 4 && UserInput != 5 && UserInput != 6 );



        if (UserInput == 1) {
            
            buy_seat(seat,scanner);
            System.out.print("\nDo you want to exit or cotinue (y or n): ");
            userAnswer = scanner.next();
            }

        else if (UserInput == 2) {

            cancel_seat(seat, scanner );
            System.out.print("\nDo you want to exit or continue (y r n): ");
            userAnswer = scanner.next();
        }

        else if (UserInput == 3) {
            find_first_aveliable(seat) ;
            System.out.print("\nDo you want to exit or cotinue (y or n): ");
            userAnswer = scanner.next();
        }

        else if (UserInput == 4) {
            show_Seating_Plan(seat) ;
            System.out.print("\nDo you want to exit or cotinue (y or n): ");
            userAnswer = scanner.next();

        }

        }
     


    
         
        }
        catch (InputMismatchException e) 
        {System.out.print("Enter correct number and Try again !") ; }
        
    }

    public static String[][] seatArray(){

        String[][] seat ;
        seat = new String[][]
        { 
        {"O","O","O","O","O","O","O","O","O","O","O","O","O","O"},
        {"O","O","O","O","O","O","O","O","O","O","O","O"}, 
        {"O","O","O","O","O","O","O","O","O","O","O","O"},
        {"O","O","O","O","O","O","O","O","O","O","O","O","O","O"},
        };

        return seat ;
    };

    public static void buy_seat(String[][] seat, Scanner scanner) { // Creat new method name called buySeat

        System.out.println("\n\n This is the seat structure") ;
        System.out.println(); 

        char rawLabel = 'A' ;  // delclair raw name


        for (int i = 0 ; i < seat.length ; i++ ) // creat row ( i < 5 ) **seat.length** = means length of rows
        {
            System.out.print(rawLabel + "    "); // print labe a raw
            for (int j = 0 ; j < seat[i].length ; j++) // creat column ( j < 14) **seat[i].length** = means 1st raw length 
            {
                System.out.print(seat[i][j] + " ") ; // print row and column 
            }
            System.out.println(); // move to the next line after one row
            rawLabel ++ ;
        }


        System.out.print("\nEnter the row letter and column number of the seat you want to book (Ex. A5): ") ; // get input from user
        String seatPosition = scanner.next() ;

        char letterInInput = seatPosition.charAt(0) ; // exract letter in the user input
        int numberInInput = Integer.parseInt(seatPosition.substring(1)) ; // exract number in the user input 
        int charPosition = letterInInput - 65  ; // A means 65

        String x = seat[charPosition][numberInInput -1] ;

        if ( x.equals("X")) {
            System.out.println("Sorry that seat is already booked ! Try another seat... ") ;
        }
        if (x.equals("O")) {
        seat[charPosition][numberInInput -1] = "X" ; // replace  O to X ** reason to use -1 for index 3 means 4th element 
        System.out.println("*** seat " + seatPosition + " has been booked ***");}


    }

    public static void cancel_seat( String[][] seat, Scanner scanner){

        System.out.print("\nEnter the row letter and column number of the seat you want to cancel (Ex. A5): ");
        String seatposition1 = scanner.next();

        char letterInInput1 = seatposition1.charAt(0) ;
        int numberInInput1 = Integer.parseInt(seatposition1.substring(1)) ;
        int charPosition1 = letterInInput1 - 65 ;

        String y = seat[charPosition1][numberInInput1-1] ;
        
        if (y.equals("O")) {
            System.out.println("That seat is already free ! Enter correct seat number....");
        }

        else if(y.equals("X")) {
            seat[charPosition1][numberInInput1-1] = "O" ; 
            System.out.println("*** Seat " + seatposition1 + " has been canceld. ! *** ") ; }
    }

    public static void find_first_aveliable(String[][] seat) {
        String searchValue = "O" ;
        boolean ifseatfound = false ;

        for (int i = 0 ; i < seat.length ; i++ ){
            for (int j = 0 ; j < seat[i].length; j++ ) {
                if (seat[i][j].equals(searchValue)) {
                    char rowLetter = (char) (65 + i) ;
                    String seatColumn = rowLetter + Integer.toString(j+1) ;
                    System.out.println("\nFree seat found at " + seatColumn);
                    ifseatfound = true ;
                    break ;

                }
            }

                if (ifseatfound){
                    break ;
                }
            
        }

        if (!ifseatfound) {
            System.out.println("Sorry! all seats are already booked...");
        }

    }

    public static void show_Seating_Plan(String[][] seat) {
        char rawLabel = 'A' ;  // delclair raw name

        System.out.println();
        System.out.println("This is the seating plan\n   \nO - avaliable seats\nX - sold seats");
        System.out.println();


        for (int i = 0 ; i < seat.length ; i++ ) // creat row ( i < 5 ) **seat.length** = means length of rows
        {
            System.out.print(rawLabel + "    "); // print labe a raw
            for (int j = 0 ; j < seat[i].length ; j++) // creat column ( j < 14) **seat[i].length** = means 1st raw length 
            {
                System.out.print(seat[i][j] + " ") ; // print row and column 
            }
            System.out.println(); // move to the next line after one row
            rawLabel ++ ;
        }

    }

}
