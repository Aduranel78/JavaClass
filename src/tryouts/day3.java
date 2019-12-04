package tryouts;

public class day3 {
    public static void main(String[] args) {
        //write a program with one int(int number=5)variable and print
        //5
        //4
        //3
        //2
        //1
        int a=5;
        System.out.println(a);
        a=a-1;
        System.out.println(a);
         a=a-1;
        System.out.println(a);
        a=a-1;
        System.out.println(a);
        a=a-1;
        System.out.println(a);

        //write a prog.which will print using reassigning variables and multiplication
        //2
        //4
        //6
        int b=2;
        System.out.println(b);
        b =b +2;
        System.out.println(b);
        b = b+2;
        System.out.println(b);
        //continue task1 but print this
        //2*1=2
        //2*2=4
        //2*3=6
        int c=2;
        int d=1;
        int result=c*d;
        System.out.println("2*1 =" + result);
        d=d+1;
        int result1=c*d;
        System.out.println("2*2 =" + result1);
        d=d+1;
        int result3=c*d;
        System.out.println("2*3 =" + result3);
        int k=2147483647;
        int l=2147483647;
        long result5=(long)k+(long)l;
        System.out.println(result5);
        int m=10;
        int n=3;
        float result7=(float)m/ n;
        System.out.println( result7);
        int r=123;
        int h=323;
        int g=34584;
        double avarege=((double)r+(double)h+(double)g/3);
        System.out.println(avarege);

        }
    }





