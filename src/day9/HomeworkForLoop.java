package day9;

import java.util.Scanner;

public class HomeworkForLoop {
    //write a program the prompts the user to input a positive integer
    //it should the print the multiplication table of the number
    //ex if user enters 3
    //then it should print 3,6,9,12,15,18,21,24,27,30
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("provide a number");
        int number=scn.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(number*i);
        }


    }
}
