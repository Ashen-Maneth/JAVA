import java.util.* ;

public class CQ03 {
    public static void main(String[] args) {

        System.out.print("Enter your value in Celsius :") ;
        Scanner scanner1 = new Scanner(System.in) ;
        double valueInCelsius = scanner1.nextDouble() ;


        double valueInFarenheit = (9.0/5)*valueInCelsius + 32 ;
        System.out.println("Your Celsius value in Farenheit : " + valueInFarenheit  + " F") ;


    }
}