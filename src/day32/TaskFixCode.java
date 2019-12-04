package day32;


public class TaskFixCode {
    public static Integer covertToInt(String number) {
        return Integer.valueOf(number);
    }

    public static void main(String[] args) {

// fix the code
        try {
            System.out.println(covertToInt("one"));
        } catch (Exception e) {
            System.out.println(covertToInt("2"));

        } finally {
            System.out.println(covertToInt("-1"));


        }
    }
}
