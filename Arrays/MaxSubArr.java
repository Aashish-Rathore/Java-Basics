package Arrays;



public class MaxSubArr {

    public static void MaxSubArray(int numbers[]){
        int currSum =0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0 ; i< numbers.length ; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                currSum = 0;
              for(int k=start;k<=end;k++){
                //subarray sum
                currSum += numbers[k];
                
              }
              if(maxsum < currSum){
                maxsum = currSum;
              }
              
            }
        }
        System.out.println("max sum = "+ maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        MaxSubArray(numbers);
    }
    
}
