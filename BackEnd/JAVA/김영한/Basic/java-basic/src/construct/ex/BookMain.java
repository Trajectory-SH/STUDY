package construct.ex;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book();
        book.displayInfo();

        Book book1 = new Book("Hello Java", "Seo");
        book1.displayInfo();

        Book book2 = new Book("JPA", "kim", 700);
        book2.displayInfo();
    }
}
