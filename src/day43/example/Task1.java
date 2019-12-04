package day43.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    //create class Multiplier
    //create method which multiply 2 integers
    //create method which multiply 3 integers
    //create method which multiply a list of integers
    //create method which multiply 2 double
    //and test them using junit
    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    static int multiply(int a, int b, int c,int d) {
        return a * b * c * d;

    }
    static double multiply(double a, double b) {
        return a * b;
    }

    static int multiply(List<Integer> numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }


    @Test
    public void multiplyTwoIntegers() {
        Assert.assertEquals(4, multiply(2, 2));
    }
    @Test
    public void multiplyThreeIntegers() {
        Assert.assertEquals(12, multiply(1, 3, 4));
    }
    @Test
    public void multiplyFourIntegers() {
        int actual = multiply(2, 2, 2, 2);
        int expected = 16;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void multiplyDoubleIntegers() {
        double actaul=multiply(3.0,5.0);
        double expected=15.0;
        Assert.assertEquals(expected,actaul,1);

    }
    @Test
    public void multiplyListIntegers() {
        int actual=multiply((Arrays.asList(1,2,3)));
        int expected=6;
        Assert.assertEquals(expected,actual);




        int a3 = multiply(1, 2, 3,4);
        System.out.println(a3);

        double a4 = multiply(2.0, 2.0);
        System.out.println(a4);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int a5 = multiply(list);
        System.out.println(a5);
    }
}

