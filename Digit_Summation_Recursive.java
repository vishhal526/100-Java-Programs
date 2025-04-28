import java.util.*;
public class Digit_Summation_Recursive{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=s.nextInt();
        int sum=0;
        int d=dsum(n,sum);
        System.out.print("Sum of digits given number="+d);
        s.close();
    }
    public static int dsum( int n, int sum){
        if(n==0){
            return sum;
        }
        else{
           sum=sum+(n%10);
           return dsum(n/10, sum);
        }
    }
}