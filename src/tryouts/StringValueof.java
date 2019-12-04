package tryouts;

import static java.lang.Integer.*;

public class StringValueof {
    public static void main(String[] args) {
        // Converting integer to String (bir string i integer a cevirme)
        int number = 10;
        String s1 = String.valueOf(number);
        System.out.println(s1 + 10); //"10" + 10 => 1010
        System.out.println("10" + 10);
        System.out.println(number + 10); // 20

        System.out.println("---------------------------------------");
        // Converting String to integer
        String s2 = "30";
        int n2 = valueOf(s2);
        // 30 + 10 => 40
        System.out.println(s2 + 10); // "30" + 10 => "3010"
        System.out.println(n2 + 10); // 30 + 10 => 40
        System.out.println("---------------------------------------");
        String l = "100";
        String m="300";
        int sum= valueOf(m);
        int sum2= valueOf(l);
        System.out.println(sum+sum2);
        System.out.println("---------------------------------------");
        String a = "5";
        int b=50;
        double d = 2.24;
        String e="22";
        int f=50000;

        double avarege=(valueOf(a)+b+d+f+ valueOf(e))/5;
        System.out.println(avarege
        );



    }

    }

