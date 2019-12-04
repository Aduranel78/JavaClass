package day40;

public class Animal {
    public String name;
    protected int baseAge;


    public Animal(String name,int baseAge) {
        this.name = name;
        this.baseAge=baseAge;

        //toString method of print info of

    }
    public String toString(){
        return ("name of the animal is:"+name)+"\n"
                +"and age is:"+"\n"
                +baseAge;
    }
}
