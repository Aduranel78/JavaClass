package day35.task;

public class Cake {
    String sugar;
    String color;

    public Cake(String c,String s) {
        color = c;
        sugar=s;
    }
    public Cake(String k){
        sugar=k;
    }

    public static void main(String[] args) {
        Cake cake=new Cake("brown sugar","red");
        Cake cake1=new Cake("brown" );
        System.out.println("our cake color is:"+cake.color + "and" + cake.sugar);
    }
}
