
import java.util.*;

public class Selection_Sort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the length of Array = ");
        int len = s.nextInt();

        int[] a = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < len; i++) {

            int min = a[i];
            int index = i;
            for (int j = i; j < len; j++) {

                if (min > a[j]) {

                    min = a[j];
                    index = j;

                }

            }

            a[index] = a[i];
            a[i] = min;
        }

        System.out.print("Sorted Array = ");

        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
