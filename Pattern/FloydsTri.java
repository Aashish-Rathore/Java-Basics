public class FloydsTri {

    public static void Floyds_Tri(int r , int c){
        int count=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floyds_Tri(5, 5);
    }
}
