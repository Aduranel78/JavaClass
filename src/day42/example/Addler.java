package day42.example;

import java.util.Arrays;
import java.util.List;

public class Addler {
    //overloading==>benzer isimli motoddan farkli parametre acmak
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){   //or  static double add(double a,double b)
        return a+b+c;                              //return a+b;
    }

    static int add(int a,int b,int c,int d) {

        return a + b + c+d;
    }
    static int add(List<Integer>numbers){
       int sum = 0;

        for (int num:numbers) {
            sum += num;
        }
            return sum;

    }
    public static void main(String[] args) {

        int r2 = add(1, 2);
        System.out.println(r2);

        int r3 = add(1, 2, 3);
        System.out.println(r3);
        int r4 = add(1, 2, 3, 4);
        System.out.println(r4);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int r5 = add(list);
        System.out.println(r5);

    }


    }

