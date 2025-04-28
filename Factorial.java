import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Ente ra number=");
        int n=s.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
         fact=i*fact;
        }
        System.out.print("Factorial of given number="+fact);
        s.close();
    }
}