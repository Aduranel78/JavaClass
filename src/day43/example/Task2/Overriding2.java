package day43.example.Task2;

public class Overriding2 {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.sound();
        ((Cat) animal).sleep();
    }

}
