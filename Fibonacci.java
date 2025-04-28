import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the term number=");
        int n=s.nextInt();
        int a=1;
        int b=0;
        int c=0;
        for(int i=0;i<n;i++){
        System.out.print(a+",");
        c=a;
        a=a+b;
        b=c;
        }
        s.close();
    }
}