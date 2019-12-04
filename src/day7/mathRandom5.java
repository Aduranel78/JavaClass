package day7;

public class mathRandom5 {
    public static void main(String[] args) {
        //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
/*
            int min = -200;
            int max = 200;
            int range = max - min;
            int randomInRange = min + (int) (Math.random() * (range + 1));

            // Task 2:
            // check if random number is positive or negative
            // where number is -200<=N<=200
            // ex: -123 => negative
            // ex: 10 => positive
            System.out.println(randomInRange);
            if(randomInRange < 0){
                System.out.println("Negative");
            }
            if(randomInRange > 0){
                System.out.println("Positive");
            }
            if(randomInRange == 0){
                System.out.println("it's ZERO");
            }

 */
        System.out.println("-------------------------");
            // Task 3:
            // Check if random number is odd or even
        int min=20;
            int max=40;
            int range=max-min;
        int randomInRange1 = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange1);
        if(randomInRange1% 2==0){
            System.out.println("it is even");
        }else {
            System.out.println("it is odd");
        }
        System.out.println("-------------------------");
        // Task 4. write a program that sums 2 random integer numbers,
        // ex: a = 10, b = 20
        //     a + b = ???;

        // 2. way
        int a = (int) (Math.random() * 10); // gets integer form double
        int b = (int) (Math.random() * 100); // gets integer form double
        System.out.println(a);
        System.out.println(b);

        System.out.println("total is:" +a+b);
        System.out.println("-------------------------");
    }

}




