
import java.util.*;

public class Radix_Sort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the length of Array = ");
        int len = s.nextInt();
        int[] a = new int[len];
        int max = 0;
        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            a[i] = s.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
        }
        int digit = 0;
        while (max > 0) {
            max = max / 10;
            digit++;
        }

        for (int i = 0; i < digit; i++) {
            a = Counting_Sort(a, i);
        }

        System.out.print("\nSorted Array =\n");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] Counting_Sort(int[] a, int digit) {

        int[] CS = new int[10];
        int[] ans = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            int SD = Significant_digit(a[i], digit);
            CS[SD]++;

        }

        for (int i = 1; i < 10; i++) {
            CS[i] = CS[i] + CS[i - 1];
        }

        for (int i = a.length - 1; i >= 0; i--) {

            int SD = Significant_digit(a[i], digit);
            ans[CS[SD] - 1] = a[i];
            CS[SD]--;

        }

        return ans;

    }

    public static int Significant_digit(int a, int digit) {

        if (digit == 0) {
            return a % 10;
        }

        int reqN = a;

        while (digit >= 1) {

            a = a / 10;
            reqN = a % 10;
            digit--;

        }

        return reqN;
    }

}
