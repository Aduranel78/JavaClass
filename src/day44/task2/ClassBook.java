package day44.task2;

public class ClassBook {
    private String bookName;
    private String bookAuthor;

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int price(){
        System.out.println("classbook price");
        return 5;
    }

}

