import java.util.*;

public class IfCondition {
    public static void main(String[]args) {

        System.out.print("Enter marks here: ");

        Scanner x = new Scanner (System.in);
         
        int Mark = x.nextInt();

        if (Mark >= 75 ) {
            System.out.println("A");
        } else if (Mark >= 60) {
            System.out.println("B");
        } else if (Mark >= 40) {
            System.out.println("C");
        } else {
            System.out.println("S");
        }




    }
}