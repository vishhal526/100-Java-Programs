
import java.util.*;

public class Decimal_To_BCD {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any Decimal Number=");
        String n = s.next();
        String a[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001"};
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '.') {
                int bcd = Character.getNumericValue(n.charAt(i));
                System.out.print(a[bcd] + " ");
            } else {
                System.out.print(". ");
            }
        }
        s.close();
    }
}
