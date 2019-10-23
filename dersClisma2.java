package day12;

import java.util.Scanner;

public class dersClisma2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("provide a temperature");
        int temperature = scan.nextInt();
        if (temperature > 80) {
            System.out.println("HOT");
        }
        else if(temperature < 80 && temperature >= 50){
            System.out.println("warm");
        }
        else if (temperature < 20 && temperature <= 10){
            System.out.println("cold");

        } else {
            System.out.println("freezing");
        }
        Scanner scan1 = new Scanner(System.in);
        System.out.println("number data type is");
        long data1 = scan1.nextLong();
        if(data1 >128 && data1 <= -127){
            System.out.println("it is byte");
        }
       else if(data1>32768 && data1 <=-32768){
           System.out.println("it is short");
       }
       else if(data1>2147483647 && data1 <=-2147483647) {

            System.out.println("it is int");
        }
       else{
            System.out.println("it is long");
        }


    }
}