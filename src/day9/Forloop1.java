package day9;

public class Forloop1 {
    public static void main(String[] args) {
        for (String s = " "; s.length() <= 10; s += "a") {
            System.out.println(s);
        }
    }
}