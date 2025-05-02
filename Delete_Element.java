
import java.util.Scanner;

public class Delete_Element {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Length of Array = ");
        int len = s.nextInt();

        int[] a = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            a[i] = s.nextInt();
        }

        System.out.println("Enter element to be deleted = ");
        int de = s.nextInt();
        boolean flag = false;
        int index = 0;

        for (int i = 0; i < len; i++) {

            if (a[i] == de) {
                flag = true;
                index = i;
            }
            if (flag && index < len - 1) {

                a[i] = a[i + 1];

            }

        }

        if (!flag) {
            System.out.print("Element not Found\n");
        }

        for (int i = 0; i < len - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
