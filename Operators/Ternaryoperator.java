package Operators;
import java.util.*;

public class Ternaryoperator {
    public static void main(String[] args) {
        int number = 5;
       String type= ((number % 2==0)) ? "even" : "odd";
       System.out.println(type);
    }
}
