
import java.util.*;
class StrOper{

    public static void printLetters(String str){
        for(int i=0 ;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};

        // // declaration
        // String str1="abcd";
        // String str2= new String("xyz");

        // //Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name= sc.nextLine();
        // System.out.println(name);



        // String fullname="Tony Stark";
        // System.out.println(fullname.length());


        //Concatenation
        String firstName="Captain";
        String lastName="America";
        String fullName=firstName+" "+lastName;
        // System.out.println(fullName.charAt(0));


        printLetters(fullName);
    }
}