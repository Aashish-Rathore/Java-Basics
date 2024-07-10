package Arrays;

public class PairsInArr {

    public static void PairsInArr(int n[]){
        int tp=0;
        //outer loop
        for(int i=0;i<n.length ;i++){     //2 se 10 tak
            int current=n[i];          //to store value
            //inner loop 
            for( int j=i+1 ;j<n.length ;j++ ){   //4,6,8,10
                System.out.print("("+ current + ","+ n[j] +")");
                tp++;
            }
           System.out.println();

        }
        System.out.println("the total pairs is : "+ tp);

    }

    public static void main(String[] args) {
        int n[]={2,4,6,8,10};

        PairsInArr(n);
    }
}
