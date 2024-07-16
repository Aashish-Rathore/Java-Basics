public class Palindrome {

    public static boolean ispalindrome(String str){
        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                System.out.println("String is a Palindrome");
                return true;
            }
        }
        System.out.println("not a palindrome");
        return false;
    }
    public static void main(String[] args) {
        String str="racecar";

        ispalindrome(str);
    }
}
