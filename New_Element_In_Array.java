
import java.util.*;

public class New_Element_In_Array {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Length of Array = ");
        int len = s.nextInt();

        int[] a = new int[len + 1];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            a[i] = s.nextInt();
        }

        System.out.println("Enter new element = ");
        int ne = s.nextInt();

        System.out.println("Enter the position of new element = ");
        int pos = s.nextInt();

        for (int i = len; i > pos-2; i--) {

            a[i] = a[i - 1];
            if(i == pos-1){
                a[i] = ne;
            }

        }

        System.out.print("New Element Added = ");

        for (int i = 0; i < len + 1; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
