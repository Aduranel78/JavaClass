package day9;

public class ForLoop2 {
    public static void main(String[] args) {
        for (int i = 0,j=1,k=2; i <=10&&j<=11&&k<=12 ; i++,j=j+2,k=j+3) {
            System.out.print("i=" +i);
            System.out.print("j=" +j);
            System.out.print("k=" +k);

            System.out.println();
        }

        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
            if (i == 10) {
                break;
            }
        }
            System.out.println("end");
        }
    }

