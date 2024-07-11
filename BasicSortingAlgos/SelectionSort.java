package BasicSortingAlgos;

public class SelectionSort {           //find smallest from unsorted and push to front   

    public static void Selection_Sort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int min= i;
            for(int j=i+1; j<arr.length;j++){
                //check
                if(arr[j]> arr[min]){
                   min = j;
                }
            }
            //Swap
            int temp = arr[min] ;
            arr[min] = arr[i] ;
            arr[i] = temp;
        }
    }

    public static void  printArr(int arr[]){
        for(int i=0;i<=arr.length;i++){
             System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        Selection_Sort(arr);
        printArr(arr);
    }
    
}
