
import java.util.*;

public class Insertion_Sort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the size of Array = ");
        int len = s.nextInt();

        int[] a = new int[len];

        for (int i = 0; i < len; i++) {

            System.out.print("Enter " + (i+1) + " Element = ");
            a[i] = s.nextInt();

        }

        System.out.print("Entered Array = ");

        for (int i = 0; i < len; i++) {

            System.out.print(a[i] + " ");

        }

        for (int i = 0; i < len-1; i++) {

            for (int j = i+1; j > 0; j--) {

                if (a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }

            }
        }

        System.out.print("\nSorted Array = ");

        for (int i = 0; i < len; i++) {

            System.out.print(a[i] + " ");

        }

        s.close();
    }
}
