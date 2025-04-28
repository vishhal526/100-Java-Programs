
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number=");
        int n = s.nextInt();
        int a = n;
        double nn = 0;
        int i = 0;
        while (a > 0) {
            i++;
            a = a / 10;
        }
        a = n;
        while (a > 0) {
            int r = a % 10;
            nn = +nn + Math.pow(r, i);
            a = a / 10;
        }
        if (nn == n) {
            System.out.print("Entered Number is Armstrong");
        } else {
            System.out.print("Entered Number is not Armstrong");
        }
        s.close();
    }
}
