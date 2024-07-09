public class invHalfPyNum {


    public static void IHP_Num(int r , int c){
        for(int i=r; i>=1;i--){
            for(int j=1;j<=i;j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        IHP_Num(5, 5);
    }
}
