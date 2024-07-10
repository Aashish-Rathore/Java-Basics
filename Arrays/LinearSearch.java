package Arrays;

public class LinearSearch {

    // public static int Linear_search(int numbers[],int key){
    //     for(int i=0 ; i<numbers.length ; i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    

    // public static void main(String[] args) {
    //     int numbers[]={2,4,6,8,10,12,14,16};
    //     int key=10;

    //     int index = Linear_search(numbers,key);
    //     if(index==-1){
    //         System.out.println("key is not found");
    //     }
    //     else{
    //         System.out.println("key is at index "+ index);
    //     }
    // }





public static int Linear_search(String menu[],String key){
        for(int i=0 ; i<menu.length ; i++){
            if(menu[i]== key){        //right way to comp string is by .equals -----> you can write as (menu[i].equals(key))
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] ={"dosa","samosa","idli","vadapav","chole-bhature","aloo-tikki","burger"};
        String key = "dosa";

        int result=Linear_search(menu, key);
        if(result !=-1){
            System.out.println("the item is found at index "+ result);
        }
        else{
            System.out.println("the item is not found");
        }
    }
}
