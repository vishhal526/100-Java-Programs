import java.util.*;
public class Odd_Even_Using_Modulo{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=s.nextInt();
        if(n-(2*(n/2))==0){
            System.out.print("Entered Number is Even");
        }
        else{
            System.out.print("Entered Number is Odd");
        }
        s.close();
    }
}