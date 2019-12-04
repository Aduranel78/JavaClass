package day9;

public class ForLoopGetAverage {
    public static void main(String[] args) {
       int N=0;
       int sum=0;
        for (int i= 1; i <=6 ; i++) {
            sum = sum + i;
            N++;
            System.out.println(N);
        }
            System.out.println("sum is:"+sum);
        System.out.println("Average is:"+(double)sum/N);

        }
    }

