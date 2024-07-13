import java.util.*;
class Matrices{
    public static boolean search(int matrix[][],int key){
        for(int i=0; i< matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key is found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3] ;    //Creation of matrix
        Scanner Sc = new Scanner(System.in);
        int r=matrix.length;  //row 
        int c =matrix[0].length; //column

        
        //Input 
        for(int i=0; i<r ;i++){
            for(int j=0 ; j<c ; j++){
                matrix[i][j]=Sc.nextInt();

            }
        }


        //output
        for(int i=0; i<r ; i++){
            for(int j=0 ; j<c ;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        search(matrix, 5);
    }
}