
import java.util.*;

public class Prime_No_In_Range {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first Number=");
        int n = s.nextInt();
        System.out.print("Enter the last Number=");
        int m = s.nextInt();
        int count = 0;
        while (n <= m) {
            for (int i = 2; i <= (n / 2); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(n + ",");
            }
            n++;
            count = 0;
        }
        s.close();
    }
}
