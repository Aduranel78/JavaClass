package day12;

public class RemoveVowels {
    public static void main(String[] args) {



        //        iWantToCallSomeMethod(a);
//        RemoveWovelsSlow();
      //  String input = "TechnoStudy";
       // int N = input.length();

        //input TechnoStudy
        //output TXchXStXdX
      //  char x = input.charAt(4);
//        System.out.println("A" + "B");
         //   iWantToCallSomeMethod(input);


        //write a method that would replace every vowel in the string with x
        // you have to use .char
        String a ="TechnoStudy";
        char x=a.charAt(4);
        //input TechnoStudy
        //output Txchxstxdx
        String input = "TechnoStudy";
        input = input.replaceAll("e,o,u", "X");
        System.out.println(input);


    }

        }

