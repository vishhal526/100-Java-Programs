
import java.util.*;

public class Bucket_Sort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the length of Array = ");
        int len = s.nextInt();

        int[] a = new int[len];

        ArrayList<Integer>[] bucketSort = new ArrayList[len];

        for (int i = 0; i < len; i++) {
            bucketSort[i] = new ArrayList<>();
        }

        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            a[i] = s.nextInt();
            int n = a[i] / len;
            bucketSort[n].add(a[i]);
        }

        int index = 0;

        for (int i = 0; i < len; i++) {

            if (!bucketSort[i].isEmpty()) {

                Collections.sort(bucketSort[i]);

                for (int j = 0; j < bucketSort[i].size(); j++) {

                    a[index] = bucketSort[i].get(j);
                    index++;

                }
            }
        }

        System.out.print("\nSorted Array = ");

        for (int i = 0; i < len; i++) {

            System.out.print(a[i] + " ");

        }

    }

}
