
import java.util.*;

class Bubble_Sort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of Array");
        int len = s.nextInt();

        int[] a = new int[len];

        for(int i=0; i<len; i++){
            System.out.print("Enter "+(i+1)+" element = ");
            a[i] = s.nextInt();
        }

        
    }
}
