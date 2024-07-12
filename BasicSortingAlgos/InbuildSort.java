package BasicSortingAlgos;

import java.util.Arrays;
import java.util.Collections;
public class InbuildSort {

    public static void printArr(Integer arr[]){    //here
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Integer arr[]= {5,3,7,2,9,1,0,8};           //that's why Integer here
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        // Arrays.sort(arr,Collections.reverseOrder()); //ye jo funct he voh sirf objects pe kaam krta he basic primitive data types pe nhi
        // Arrays.sort(arr,0,8);   //will check upto actual index-1 
        printArr(arr);
    }
}
