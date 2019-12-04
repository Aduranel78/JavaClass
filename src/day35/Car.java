package day35;

public class Car {
    int modelYear;
    String modelName;

    public Car(int year,String name){
        modelName=name;
        modelYear=year;

    }

    public static void main(String[] args) {
        Car cr1=new Car(1990,"toyota");
        System.out.println(cr1.modelName +" "+cr1.modelYear);

    }
}
