package FunctionsAndMethods;
import java.util.*;
public class FunctQue {


// Question-1

// public static int Avg(int x, int y, int z){

//     int Avg= (x+y+z) /3;

//     return Avg;

// }
// public static void main(String[] args) {
    
//    System.out.println(Avg(45, 18, 7));
// }





// Question 2
// public static boolean isEven(int n){
// if(n % 2==0){
//     return true;
// }
// return false;
// }
// public static void main(String[] args) {
//    System.out.println( isEven(5));
// }
// }






    // Question 3
    public static boolean isPalindrome(int n){
        int palindrome=n;
        int Revnum=0;
        while(palindrome!=0){
            int lastdigit = n % 10;        //extracting the last digit 
            Revnum =(Revnum*10) + lastdigit;  //Appending last digit

            palindrome=palindrome/10;           //Shrinking n by discarding the last digit
        }
        if(n==Revnum){
            return true;
        }
        return false;
    
    }

    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int palindrome = Sc.nextInt();


        if(isPalindrome(palindrome)){
            System.out.println("no. "+ palindrome + " is a palindrome ");
        }
        else{
            System.out.println("no. "+ palindrome + " is not a palindrome");
        }
       
        }


 }
    





