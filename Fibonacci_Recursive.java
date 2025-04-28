import java.util.*;
public class Fibonacci_Recursive{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the term number=");
        int n=s.nextInt();
        int a=1;
        int b=0;
        int c=0;
        int fs=fibo(n,a,b,c);
        System.out.print(fs);
        s.close();
    }
    public static int fibo(int n, int a, int b, int c){
        if(n>1){
            System.out.print(a+",");
            c=a;
            a=a+b;
            b=c;
            return fibo(n-1, a, b, c);
        }
        else{
            return a;
        }
    }
}