
import java.util.*;

public class Division_without_Operator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter bigger Number = ");
        int big = s.nextInt();

        System.out.print("Enter smaller Number = ");
        int small = s.nextInt();

        int quotient = 0;

        while (small <= big) {
            big = big - small;
            quotient++;
        }

        System.out.print("The Quotient on Dividing is = " + quotient + " and the remainder = " + big);

    }
}
