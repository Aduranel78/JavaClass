package day32;

public class javaException {
    public static void main(String[] args) {
        //Java exceptions:Exception types and try,catch,finally
        //  create array of size 5
// try to access to index 10
        int[] numbers = new int[15];

        try {
            System.out.println(numbers[10]);
        }catch (Exception ex){
            System.out.println("Something happened");
        }

        int a=10;
        int b=0;
        int result=a/b;
        try{
            System.out.println(result);
        }catch (Exception s){
            System.out.println("you dont know math");
        }
    }
}