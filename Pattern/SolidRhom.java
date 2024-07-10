
public class SolidRhom {
    public static void Solid_Rhom(int n){
        for(int i=1 ; i<=n; i++){
            //Spaces
            for(int j=1 ;j<=n-i; j++){
                System.out.print(" ");
            }
        
            //Stars
            for(int j=0 ; j<=n;j++){
                System.out.print("*");
            }

        System.out.println();

        }

    }
    public static void main(String[] args) {
        Solid_Rhom(5);
    }
}
