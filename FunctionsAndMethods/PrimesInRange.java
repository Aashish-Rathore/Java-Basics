package FunctionsAndMethods;
import java.util.*;
public class PrimesInRange {
    
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    


    public static void PrimeinRange(int n){
        for (int i=2 ; i<=n;i++){
           if (isPrime(i)){
            System.out.print(i+" ");
           }
        }
        System.out.println();
    }


    public static void main (String args[]) {
    PrimeinRange(10);
    }
       
 }
