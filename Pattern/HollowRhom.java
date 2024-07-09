public class HollowRhom {
    public static void Hollow_Rhom(int n){
        for(int i=1 ; i<=n; i++){
            //Spaces
            for(int j=1 ;j<=n-i; j++){
                System.out.print(" ");
            }
        
            //Stars
            for(int j=1 ; j<=n;j++){
                if(i==1 || i==5 || j==1 ||j==5){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

        System.out.println();

        }

    }
   
    public static void main(String[] args) {
       Hollow_Rhom(5); 
    }
}
