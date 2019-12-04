package day35;

public class food {
    public String name;
    public String sideDish;
    public String ingeredents;
    public String oil;
    public int amountOfingredients;


    public boolean hasButter(String oil) {
        if (oil.equals("butter")) {
            return true;
        } else {
            return false;

        }
    }

    public void test() {
        if (amountOfingredients == 2) {
            System.out.println("ok");
        } else if (amountOfingredients == 3) {
            System.out.println("delicious");
        } else if (amountOfingredients == 6) {
            System.out.println("need watering");
        }
    }
}

