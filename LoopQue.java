import java.util.Scanner;

public class LoopQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question 1
        for(int i=0 ; i<5 ; i++){
            System.out.println("HELLO");
            i+=2;
        }


        // Question 3
        int fact=1;
        int n=5;
        while (n>0) {
            fact=fact*n;
            n--;
        }
        System.out.println(fact);




        // Question 4
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        int i=1;
       while(i<=10){
        System.out.println(i*n);
        i++;
       }
    }
}

    

