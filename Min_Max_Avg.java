import java.util.*;
public class Min_Max_Avg{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no of number Taken = ");
        int n = s.nextInt();
        int min = 0;
        int max = 0;
        double avg = 0;

        for(int i=0 ;i<n ;i++){
            System.out.println("Enter number "+(1+i)+" number = ");
            int a = s.nextInt();

            if(min > a || i == 0){
                min = a;
            }

            if(max < a){
                max = a;
            }

            avg = avg + a; 
        }

        System.out.print("Maximun number is = "+max+" Minimum number is = "+min+" And Average is = "+(avg/n));
        s.close();
    }
}