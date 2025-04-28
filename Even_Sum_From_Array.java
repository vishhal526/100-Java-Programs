import java.util.*;
public class Even_Sum_From_Array{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of the array=");
        int n=s.nextInt();
        int sum=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element = ");
            a[i]=s.nextInt();
            if(a[i]%2==0){
              sum=sum+a[i];
            }
        }
        System.out.print("Sum of even numbers of elements in Array is = "+sum);
        s.close();
    }
}