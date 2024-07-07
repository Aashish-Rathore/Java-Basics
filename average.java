import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the first value");
        int a=sc.nextInt();
        System.out.println("enter the second value");
        int b=sc.nextInt();
        System.out.println("enter the third value");
        int c=sc.nextInt();

        int average=(a+b+c)/3;
        System.out.println("the avg of all values is"+"="+average);
    }
}
