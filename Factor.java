import java.util.*;
public class Factor{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+",");
            }
        }
        s.close();
    }
}