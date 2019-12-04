package day42.example.overriding;

public class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("dog bark haww");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
