import java.util.* ;

public class Qu_07 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in) ;

        try 
        {

        String UserInput = " " ;
        boolean NextContinue = true ;

        System.out.println("\nWelcome to ABCD banking system") ;

        System.out.print("\nEnter your account balce : ") ; 
        double AccountBalance = scanner1.nextDouble() ;

        while (NextContinue)

        {

        System.out.print("\nEnter your transection type : \n1) Deposit\n2) Withdrawal\n3) Check \n\nEnter letter here : ") ;
        int TransectionType = scanner1.nextInt() ;

        if (TransectionType == 1) 
            { System.out.print("\nEnter deposit amount : ") ; 
            double DepositAmount = scanner1.nextDouble() ;
            AccountBalance = AccountBalance + DepositAmount ; 
            System.out.println("\nYour balnce is " + AccountBalance) ; }

        else if (TransectionType == 2 )
        { 
            if (AccountBalance <= 0 )
                {System.out.println("you havent enugh mony ! ") ; }
            else {
                System.out.println("\nyou can withdraw only " + AccountBalance );
                System.out.print("Enter withdrawal amount : ") ;
                double WithdrawalAmount = scanner1.nextDouble() ;
                if (WithdrawalAmount > AccountBalance)
                    {System.out.println("\nSorry we cant process your withdrawal pleace enter withdraw amount under " + AccountBalance) ;}
                else 
                    { AccountBalance = AccountBalance - WithdrawalAmount ;
                    System.out.println("\nYour balnce is " + AccountBalance) ; }} }

        else if ( TransectionType == 3 )
            {System.out.print("\nEnter check amount :  ") ; 
            double CheckAmount = scanner1.nextDouble() ;
            AccountBalance = AccountBalance - CheckAmount ;
                if ( AccountBalance <= 0 )
                    {System.out.println("\nYour account balance is minus. you have " + AccountBalance + " fraud  ") ;} 
                else if (AccountBalance <= 100 )
                    {System.out.println("\nYour account balance is low ( under 100$ ) ") ;
                    System.out.println("\nYour balnce is " + AccountBalance) ;}
            }

        else 
            {System.out.println("\nEnter vaild number") ; }

        do 
            {System.out.print("\nDo you want to do another transection pleace enter y if no enter n : ") ; 
            UserInput = scanner1.next() ; }

        while (!UserInput.equals("y") && !UserInput.equals("n") ) ;

        if (UserInput.equals("n"))
            {NextContinue = false ;}





        }

    }

    catch (InputMismatchException e)
    {System.out.print("\nEnter correct value ! ") ; }


    }
}