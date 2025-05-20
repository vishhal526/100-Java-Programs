
import java.util.*;

public class Pascal_Triangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            int a = 1;

            for (int k = 0; k < n - i - 1; k++) {

                System.out.print(" ");

            }

            for (int j = 0; j < i + 1; j++) {

                System.out.print(a + " ");
                a = a * (i - j) / (j + 1);

            }

            System.out.print("\n");
        }

    }
}
