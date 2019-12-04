package day7;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scan.nextLine();//aysegul

        System.out.println("Welcome " + name + "!!!");
        System.out.println("-------------------------");
        //TODO Task 1:
// Write a program that ask a number,
// in your console it should print same as below:
// Provide a number:
// 3
// Your number is 3

                Scanner scan1 = new Scanner(System.in);

                System.out.println("Provide a number:");
                int number = scan1.nextInt();


                System.out.println("Your number is " + number);


            //TODO Task 2:
            // Write a program that ask two number,
            // in your console it should print same as below:
            // Provide a first number:
            // 3
            // Your first number is 3
            // Provide a second number:
            // 5
            // Your second number is 5
            Scanner scan3=new Scanner((System.in));
            System.out.println("Provide a  number");
            int num=scan3.nextInt();
        System.out.println("your firts number"+num);
        int num2=scan3.nextInt();
        System.out.println("your second number"+ num2);
        int f=num2+num;
        System.out.println(f);
        }
    }



