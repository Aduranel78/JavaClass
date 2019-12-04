package day38.example;

import day38.example.models.Person;

class ExamplePublic {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="max";
        System.out.println("from Attributes:"+p);
        System.out.println("from method:"+p);


        String nameofPerson=p.getName();

       p.printDetails();
    }
}
