package day37;
//        "prepend"+"initial point" + "append"
public class Stringbuilder {
    // Given string reverse that string
    // ex: Max => xaM
    public String reverseString(String str) {
//        String abc = "a" + "b" + "c";
//        String s1 = "a";
//        String s2 = "ab";
//        String s3 = "abc";

        StringBuilder sb = new StringBuilder();
//        ""
        sb.append(str);
//        "" + str

        StringBuilder reverse = sb.reverse();
        String result = reverse.toString();
        return result;
    }

    public static void main(String[] args) {
        String simpleString = "a" + "b" + "c";
//      s1 = "a";
//      s2 = "ab";
//      s3 = "abc";

        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        String sbString = sb.toString();

        System.out.println("simpleString: " + simpleString);
        System.out.println("sbString: " + sbString);
    }
}



