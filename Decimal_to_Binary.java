
import java.util.*;

public class Decimal_to_Binary {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Binary Number = ");
        int decimal = s.nextInt();
        StringBuffer binary = new StringBuffer();

        while (decimal > 0) {

            binary.append(decimal % 2);

            decimal = decimal / 2;

        }

        System.out.print("Binary of given Decimal Number = " + binary.reverse());

    }
}
