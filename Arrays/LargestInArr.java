package Arrays;

public class LargestInArr {

    public static int largestArray(int numbers[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0 ;i<numbers.length ;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;

    }    

    public static void main(String[] args) {
        int numbers[]={1,2,3,6,5,0};

        System.out.println(largestArray(numbers));
    }
}
