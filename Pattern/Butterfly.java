public class Butterfly {

    public static void Butterfly_patt(int n){
        //First part
        for(int i=1 ;i<=n ; i++ ){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }


            //Spaces
            int space=2*(n-i);
            for(int j=1;j<=space ; j++){
                System.out.print(" ");
            }

            //Second part
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
        System.out.println();
        }
        // _____________________________________________________
        //Lower half 
         //First part
         for(int i=n ;i>=1 ; i-- ){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }


            //Spaces
            int space=2*(n-i);
            for(int j=1;j<=space ; j++){
                System.out.print(" ");
            }

            //Second part
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        Butterfly_patt(4);
    }
}
