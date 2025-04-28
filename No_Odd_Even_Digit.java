import java.util.*;
public class No_Odd_Even_Digit{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Number=");
        int n=s.nextInt();
        int ce=0;
        int co=0;
        while(n>0){
            int a=n%10;
            if(a%2==0){
              ce++;
            }
            else{
                co++;
            }
            n=n/10;
        }
        System.out.print("Number of Odd digits in the number="+co+"\nNumber of Even digits in the number="+ce);
        s.close();
    }
}