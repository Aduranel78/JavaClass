package day12;

import java.util.Scanner;

public class desrCalisma3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("provide of day");

        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("thusday");
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thersday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not in range a week");


        }

    }
}
