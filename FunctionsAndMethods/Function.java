package FunctionsAndMethods;
import java.util.Scanner;

public class Function {


//     public static void CalculateSum(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the digits");
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         int c= a+b;
//         System.out.println("sum is "+ c);
//     }



//     public static void main(String[] args) {
//         CalculateSum();
//     }






// //In java the call by Value method is present.the copy of actual variable is passed as arguments and not the real arguments
// // whereas in C++ call by reference is their which passes actual variable as an argument.

//     //CallByValue-->>>>>>
//     public static void Swap(int a,int b){
//         //Swap
//         int temp = a;
//         a = b;
//         b=temp;

//         System.out.println("the value of a is "+a);
//         System.out.println("the value of b is "+b);

//     }



    // public static void main(String[] args) {
        // Swap(5, 9);
    // }






    // public static int multiply(int a,int b){
    //     int prod = a*b;
    //     return prod;
    // }

    // public static void main(String[] args) {
    //     int ans= multiply(5, 2);
    //     System.out.println("the multiplication of a and b is :"+ ans);
    // }







    public static int Factorial(int n){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }


    // public static void main(String[] args) {
    //   int ans=  Factorial(5);
    //   System.out.println("the factorial of number is : "+ ans);
    // }










    public static int BinCoeff(int n , int r){
       int  fact_n= Factorial(n);
       int  fact_r= Factorial(r);
       int  fact_nmr= Factorial(n-r);


       int BinCoeff = fact_n/(fact_r * fact_nmr);
       return BinCoeff;

    }
    public static void main(String[] args) {
       System.out.println(BinCoeff(5, 2));
    }









}





