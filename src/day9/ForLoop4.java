package day9;

import java.util.Scanner;

public class ForLoop4 {
    public static void main(String[] args) {
        //write a program that takes two numbers
        //from console,and show multiplication up to tahat "a" number
        //ex a=3,b=2
        //2=>2*1
        //4=>2*2
        //8=>2*4

        for (int i = 1, j = 2, k = 2; i <= 10; i++, k = k + 2) {
            System.out.println(j + "x" + i + "=" + k);
        }
        Scanner scn = new Scanner(System.in);
        System.out.println("provide a:");
        int a = scn.nextInt();
        System.out.println("provide b:");
        int b = scn.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println(i * b);
        }
    }
}
