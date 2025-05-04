
import java.util.*;

public class Counting_Sort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int max = 0;

        System.out.print("Enter the length of Array = ");
        int len = s.nextInt();
        int[] a = new int[len];

        for (int i = 0; i < len; i++) {

            System.out.print("Enter " + (i + 1) + " element = ");
            a[i] = s.nextInt();
            if (a[i] > max) {
                max = a[i];
            }

        }

        int[] CS = new int[max + 1];

        for (int i = 0; i < len; i++) {

            CS[a[i]]++;

        }

        for (int i = 0; i < max; i++) {

            CS[i + 1] = CS[i + 1] + CS[i];

        }

        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {

            ans[CS[a[i]] - 1] = a[i];
            CS[a[i]]--;
            System.out.print("\n");

        }

        System.out.print("Sorted Array = ");

        for (int i = 0; i < len; i++) {
            System.out.print(ans[i] + " ");
        }

    }

}
