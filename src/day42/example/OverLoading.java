package day42.example;

public class OverLoading {
    void sum(short a,short b){
        System.out.println("a metod with short parameters");
    }
    void sum(int a,int b){
        System.out.println("a metod with int parameters");
    }

    public static void main(String[] args) {
        OverLoading obj=new OverLoading();
        obj.sum(20, 20);//now ambiguity
        //1 way to class sum method with short
        short a=20,b=20;
        obj.sum(a,b);
        //2 way

    }
}
