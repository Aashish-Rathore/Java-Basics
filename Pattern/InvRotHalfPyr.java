public class InvRotHalfPyr {


    public static void IRH_pymd(int r , int c){
        int n=4;
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print ("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        IRH_pymd(4, 4);
    }
}
