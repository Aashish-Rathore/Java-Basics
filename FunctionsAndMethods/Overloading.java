package FunctionsAndMethods;
public class Overloading {



    //func to calc sum of 2 nums
    // public static int sum(int a , int b){
    //     return a+b;
    // }


    //func to calc sum of 3 nums
//     public static int sum (int a, int b , int c){
//         return a+b+c;
//     }
//     public static void main (String[] args) {
//         System.out.println(sum(4, 5));
//         System.out.println(sum(5, 2, 1));
//     }







    // public static boolean isPrime(int n){
    //     //Corner cases 
        //2
    //     if(n==2){
    //         return true;
    //     }

    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //           return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void main(String[] args) {
    //    System.out.println(isPrime(2));
    // }






    //Optimized Prime number
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n*i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }




}
