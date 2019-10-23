package day12;

import java.util.Scanner;

public class dersCalisma1 {
    public static void main(String[] args) {
        // write a program that prints number of word representation number
        //          where number is 0 <= N <=3
        // ZERO => 0
        //  ONE => 1


        Scanner scan = new Scanner(System.in);
        String a1 = scan.nextLine();

        if (a1.equals( "Zero")) {

            System.out.println(0);
        }

        if (a1.equals("One")){

            System.out.println(1);
        }
       if(a1.equals("Two")){
        System.out.println(2);

    }
        if(a1.equals ("three")){
            System.out.println(3);

        }

        }

}