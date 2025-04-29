
import java.util.*;

class Bubble_Sort {

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

            for (int j = 1; j < (len - i); j++) {

                if (a[j] < a[j - 1]) {

                    int x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;

                }

            }
        }

        System.out.print("Sorted Array = ");

        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
