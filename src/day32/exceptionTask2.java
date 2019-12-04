package day32;

public class exceptionTask2 {
    public static void main(String[] args) {
        String[] arr = {"Hi", "Hello", null};

        // print first characters of words

        try{
            for (int i = 0; i < arr.length; i++) {
                char [] c = arr[i].toCharArray();
                System.out.println(c[0]);
            }
        } catch (Exception ex) {
            System.out.println("hey you have an error");
            ex.printStackTrace();
        }
    }
}
