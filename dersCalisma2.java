package day12;

import java.util.Scanner;

public class dersCalisma2 {
    public static void main(String[] args) {
        //  write a program that prints word representation of your number where number
        //  0 <= N <= 3
        // 0=>zero
        //  3=>three

        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        if (a1 == 0) {
            System.out.println("zero");

        }
        if (a1 == 1) {
            System.out.println("one");

        }
        if (a1 == 2) {
            System.out.println("two");
        }
        if (a1 == 3) {
            System.out.println("tree");
        }

    }
}