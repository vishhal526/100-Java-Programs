import java.util.*;
public class Factorial_Recursive{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Number=");
        int n=s.nextInt();
        int f=fact(n);
        System.out.print("Factorial of given Number="+f); 
        s.close();
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }
}