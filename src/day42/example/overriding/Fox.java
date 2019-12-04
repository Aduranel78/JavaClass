package day42.example.overriding;

public class Fox extends Animal {
    @Override
    public void sound(){
        System.out.println("Ring-ding");
    }
    public void hunt(){
        System.out.println("hunt");
    }
}

