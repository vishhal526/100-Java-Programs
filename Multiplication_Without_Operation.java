
import java.util.*;

public class Multiplication_Without_Operation {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter Base Number = ");
        int base = s.nextInt();

        int ans = 1;

        System.out.print("\nEnter Power Number = ");
        int power = s.nextInt();

        ans = (power > 0) ? base : 1;
        int sum = base;

        for (int i = 1; i < power; i++) {

            for (int j = 1; j < base; j++) {

                ans = ans + sum;

            }

            sum = ans;

        }

        System.out.print("Answer for Power " + power + " and base " + base + " = " + ans);

    }

}
