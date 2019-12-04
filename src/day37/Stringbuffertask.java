package day37;

public class Stringbuffertask {
    public static void main(String[] args) {

        String s=" ";

        StringBuffer sb= new StringBuffer();

        sb.append(s);
        for(char i=65; i<=90 ;i++) {

            sb.append(i);

        }
        System.out.println(sb.toString());
    }
}



