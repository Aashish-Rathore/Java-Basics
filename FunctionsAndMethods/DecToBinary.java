package FunctionsAndMethods;

public class DecToBinary {

    public static void DecToBin(int DecNum){
        int mynum = DecNum;
        int binNum = 0;
        int pow =0 ;
    while(DecNum > 0){
        int Rem = DecNum % 2;
        binNum = binNum + Rem * (int)Math.pow(10,pow);

        pow++;
        DecNum/= 2;
    }
    System.out.println("the Decimal of "+ mynum + " to Binary is " + binNum);
    }
    public static void main(String[] args) {
        DecToBin(4);
    }
}
