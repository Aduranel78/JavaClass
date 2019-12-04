package day40;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p=new Person();
        p.setName("techno");

        String actual=p.getName();
        String expected="techno";
        Assert.assertEquals(actual,expected);


    }

    @Test
    void setName() {


    }

    @Test
    void method() {
        String s="my name is ayse";
    }
}