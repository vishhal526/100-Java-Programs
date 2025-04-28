import java.util.*;
public class Angle_Between_Hands{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the place of Hour hand=");
        int hh=s.nextInt()*5;
        System.out.print("Enter the place of minute hand=");
        int mh=s.nextInt()*5;
        int angle;
        if(mh>hh){
             angle=(mh-hh)*6;
        }
        else{
            angle=(hh-mh)*6;
        }
        System.out.print("Angle between entered Hour hand and Minute hand="+angle+"Degree");
        s.close();
    }
}