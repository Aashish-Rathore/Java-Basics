public class StringBuild{
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
             sb.append(ch);
        }
        //0(26) in Stringbuilder
        //(26 * n^2 ) in Strings
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
