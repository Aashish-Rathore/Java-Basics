public class Countlowcase {

    public static void  vowels(String str , int Count){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch=='i' || ch=='0' || ch=='u'){
                Count++;
            }
        }
        System.out.println("count of vowel is "+ Count);
    }
    public static void main(String[] args) {
        String str ="Aashish";
        int Count= 0;

       vowels(str, Count);
    }
}
