import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter value of first Variable");
       int A= Sc.nextInt();
       System.out.println("Enter value of Second Variable");
       int B = Sc.nextInt();
        System.out.println("enter the operation you want to perform");
       char operator = Sc.next().charAt(0);
       
       switch (operator) {
        case '+':System.out.println(A+B);
            break;
        case '-':System.out.println(A-B);
            break;
        case '/':System.out.println(A/B);
            break;
        case '*':System.out.println(A*B);
            break;
        case '%':System.out.println(A%B);
            break;
            
        default:System.out.println("enter the right value");
            break;
       }
    }
}


