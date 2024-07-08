import java.util.*;
public class leapyear {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in) ;
       System.out.println("enter the year you wanna check :");
       int  year= Sc.nextInt();
       if((year%4==0) || (year%100==0) &&  (year%400==0)){
        System.out.println("it is a leap year");
       }
       else{
        System.out.println("It's not an leap year");
       }
    }
}
