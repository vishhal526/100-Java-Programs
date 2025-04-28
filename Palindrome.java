import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a string=");
        String a=s.next();
        StringBuilder ans=new StringBuilder(a.length());
        for(int i=a.length()-1;i>=0;i--){
            char x=a.charAt(i);
            ans.append(x);
        }
        if(a.equals(ans.toString())){
            System.out.print("Entered String is Palindrome");
        }
        else{
            System.out.print("Entered String is not Palindrome");
        }
        s.close();
    }
}