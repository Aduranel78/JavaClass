package day38.example.models;

public class Person {
    public String name;

    public Person() {
        System.out.println("in defoult constrauctor");
    }


    public String getName() {
        return name;
    }
    public void printDetails(){
        System.out.println("some datails");
    }
}
