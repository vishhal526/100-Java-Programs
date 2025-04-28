import java.util.*;
public class Factor_Recursive{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any Number=");
        int n=s.nextInt();
        int i=1;
        int f=fact(n,i);
        System.out.print(f);
        s.close();
    }
    public static int fact(int n,int i){
        if(n%i==0){
            System.out.print(i+",");
            i++;
            return fact(n,i);
        }
        else{
             return n;
        }
    }
}