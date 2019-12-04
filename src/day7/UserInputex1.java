package day7;

import java.util.Scanner;

public class UserInputex1 {
    public static void main(String[] args) {
        // 1. write a program that prints word representation of your number
//      where number is 0 <= N <= 3
// ex: 0 => zero
// ex: 3 => three

// HW:2. write a program that prints number of word representation number
//     where number is 0 <= N <= 3
// ex: zero => 0
//     one => 1


        Scanner scan = new Scanner(System.in);
                System.out.println("Provide a number[0-3]: ");

                int number = scan.nextInt();
                if(number == 0){
                    System.out.println("zero");
                }
                if(number == 1){
                    System.out.println("One");
                }
                if(number == 2){
                    System.out.println("Two");
                }
                if(number == 3){
                    System.out.println("Three");
                }
        System.out.println("-------------------------");
                //hw2
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Provide a number[0-3]: ");
        String s1 = scan1.nextLine();

        if("zero".equalsIgnoreCase(s1)){
            System.out.println(0);
        }
        if(s1.equals("one")){
            System.out.println(1);
        }
        if(s1.equals("two")){
            System.out.println(2);
        }
        if(s1.equals("three")){
            System.out.println(3);
        }
    }
}




