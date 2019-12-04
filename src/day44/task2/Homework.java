package day44.task2;

import org.junit.Assert;
import org.junit.Test;

public class Homework {
    // Let's write a Online-Shop that sells books: ChildrenBook & Comics
    // use inheritance, polymorphism and encapsulation while doing this

    // Note: this HW is open-ended, so there a lot of way to solve it
    // task about salary is similar to this

    // Hint: you can use Book as parent class and define price() method there
    @Test
    public void testOfBook() {

        ClassBook classBook = new ChildrenBook();
        int actual = classBook.price();
        Assert.assertEquals(10,actual);
    }
    @Test
    public void testOfBook2() {
        ClassBook classBook2=new ComicBook();
        Assert.assertEquals(15,classBook2.price());
    }
}
