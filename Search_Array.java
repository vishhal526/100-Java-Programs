
import java.util.*;

public class Search_Array {

    static int index = 0;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Length of Array = ");
        int len = s.nextInt();

        int[] a = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            a[i] = s.nextInt();
        }

        while (1 > 0) {
            System.out.print("To search press 1 or 0 close = ");
            int choice = s.nextInt();

            if (choice == 0) {
                break;
            } else {

                System.out.print("Enter the element to be searched = ");
                int x = s.nextInt();

                int ans = isInArray(a, x);

                if (ans == 0) {

                    System.out.print("Element not Found");

                } else {

                    System.out.println("Element Found");

                }

            }
        }

    }

    public static int isInArray(int[] a, int m) {

        if (a[index] == m) {
            index = 0;
            return 1;
        }
        if (index == a.length - 1) {
            return 0;
        }
        index++;
        return isInArray(a, m);

    }

}
