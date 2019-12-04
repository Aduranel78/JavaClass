package day38.example.publicAcssesModifire;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ExamplePrivate2 {
    public int sumListofRandomIntegers() {
        //generating list of random numbers
        Random random = new Random();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(50));
        }


        //sum List of numbers
        //task ,try to make second part of sumlist also private
        int sumListofNumbers = 0;
        for (Integer integer : numbers) {
            sumListofNumbers += integer;
        }
        return sumListofNumbers;
    }


}
