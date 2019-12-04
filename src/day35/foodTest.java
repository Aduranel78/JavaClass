package day35;

import static org.junit.jupiter.api.Assertions.*;

class foodTest {
   food food=new food();

   boolean result=food.hasButter("butter");
    @org.junit.jupiter.api.Test
    void hasButter() {
        food.oil="butter";
        assertEquals(true,result);
    }

    @org.junit.jupiter.api.Test
    void test1() {
    }
}