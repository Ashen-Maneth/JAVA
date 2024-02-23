import java.util.* ;
public class CQ02 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner (System.in ) ;

        System.out.print("Enter values in Meters : ") ;
        double inputInMeters = scanner1.nextDouble();

        double valueInCentimeters = inputInMeters * 100 ;

        System.out.println(inputInMeters + " M " + "in centimeters : " + valueInCentimeters ) ;



    }
}