import java.util.*;
public class Digit_Summation{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=s.nextInt();
        int sum=0;
        while(n>0){
            int a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.print("Sum of digit of given Number="+sum);
        s.close();
    }
}