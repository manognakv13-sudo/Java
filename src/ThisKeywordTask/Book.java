package ThisKeywordTask;

public class Book {
    String title;
    double price;
    Book(){

        this("unknown",0.00);
        System.out.println("this is no argument constructor");
    }

    Book(String title, double price){
        System.out.println("parameterized constuctor");
        System.out.println("title "+title +" price  "+price);
    }

    public static void main(String[] args) {
        Book  book = new Book();
        Book book1 = new Book("manogna", 2132431.909);
    }
}
