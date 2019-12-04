/*
package day32;

//create a class
// add at least 3 attributes
// add at least 3 constructor
// add method that return all attributes as one string
// in Task 2 class create at least 4 object on that class
// call method to get attributes and print it
class Car{
   public String modelName;
    public int SerialNumber;
    public int modelYear;
    public boolean trustworthiness;
    public Car() {
        modelYear = 1990;
        SerialNumber = 000;
        modelName = "toyota";
    }

        public Car(boolean t){

       this( 1990, 234,"ford");
            trustworthiness=t;
    }
    public Car( int year,int num,String name) {
        modelYear = 2018;
        SerialNumber = 9999;
        modelName = "toyota";

    }
    public String getAttributes() {
        return "car year :" + 2018+ "\n"+"car name:"+ "toyota"+ "\n "+"Serial number"+ 9999 +"\n";


}

public class task2 {

        public static void main(String[] args) {
            Car toyot = new Car(2010, 1, "Chase");
            System.out.println(toyot.printOut());
            System.out.println("------------------------------------");

            Car ban = new Car();
            ban.trustworthiness = true;
            ban.N = "toyota";
            ban.S = 2010;
            System.out.println(ban.printOut());
            System.out.println("------------------------------------");

            Car trustworthyCar = new Car(true);
            System.out.println(trustworthyCar.printOut());
            System.out.println("------------------------------------");

            Car td = new Car(2005, 101010, "TD", true);
            System.out.println(td.printOut());
        }

}


}

}
*/