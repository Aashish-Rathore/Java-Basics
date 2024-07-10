package Arrays;

public class RevArr {
     
    public static void Rev_Arr(int num[]){
        int first = 0; int last = num.length-1;

        while(first<=last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        Rev_Arr(num);

        //Print
        for(int i=0 ;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
