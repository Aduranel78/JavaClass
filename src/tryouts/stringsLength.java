package tryouts;

public class stringsLength {
    public static void main(String[] args) {
        String n="aysegul";
        String m="s";
        int sum=m.length()+n.length();
        System.out.println(sum);
        if(sum==0) {
            System.out.println("it has correct");
        } else if(sum>0) {
            System.out.println("perfect");
        }else if(sum<0){
            System.out.println("working");
        }else {
            System.out.println("it has not correct");
        }
    }
}
