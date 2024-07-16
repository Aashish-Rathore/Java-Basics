public class SubStr {

    public static String Sub_Str(String str,int si,int ei){
        String substr = "" ;
        for(int i=si;i<ei;i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str ="HelloWorld";
        System.out.println(str.substring(0,5));         //Inbuild function in java
        // System.out.println(Sub_Str(str, 0, 5));
    }
}
