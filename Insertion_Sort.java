import java.util.*;
public class Insertion_Sort{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of Array=");
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+" Element");
            a[i]=s.nextInt();
        }
        System.out.print("Entered Array=");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
        for(int i = n-1;i>=0;i--){
            
        }
        System.out.print("Sorted Array=");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
        s.close();
    }
}