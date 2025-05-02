
import java.util.*;

public class Binary_To_Decimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Binary number = ");
        String binary = s.next();

        double decimal = 0;

        for (int i = 0; i < binary.length(); i++) {

            char a = binary.charAt(i);
            if (a == '1') {
                decimal = decimal + Math.pow(2, binary.length() - i - 1);
            }

        }

        System.out.print("Decimal value of Binary number " + binary + " is = " + decimal);
    }
}
