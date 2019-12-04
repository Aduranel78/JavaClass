package day43.example.Task3;

public class Overriding3 {
    public static void main(String[] args) {
        Animal cat=new Cat();
        ((Cat)cat ).sleep();


        Animal dog=new Dog();
        ((Dog)dog).run();

        Animal fox=new Fox();
        ((Fox)fox).hunt();



    }
}
