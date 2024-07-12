package BasicSortingAlgos;

public class InsertionSort {
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
                int j=i-1;
                int x =arr[i];
                while(j>-1 && arr[j]>x){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1]=x;
            }
        }
        public static void printArr(int arr[]){
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
    public static void main(String[] args) {
        int arr[]={6,8,12,10,2,20,18};
        InsertionSort(arr);
        printArr(arr);
    }
}
