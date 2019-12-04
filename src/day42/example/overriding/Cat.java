package day42.example.overriding;

public class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("cat say meow");
    }
}
