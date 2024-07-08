import java.util.*;
public class billing {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the cost of eraser");
        float eraser= Sc.nextInt();
        System.out.println("enter the cost of pen");
        float pen= Sc.nextInt();
        System.out.println("enter the cost of pencil");
        float pencil= Sc.nextInt();

        float totalpurchase=pen+eraser+pencil;
        float gst=(totalpurchase*18)/100;

        float totalbill=totalpurchase+gst;

        System.out.println("your final bill is"+"="+totalbill);
    }
}
