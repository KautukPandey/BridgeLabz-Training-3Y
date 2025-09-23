public class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book("12345", "Java Basics", "John Smith");
        b1.displayBookDetails();

        b1.setAuthor("Michael Doe");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb = new EBook("67890", "AI Revolution", "Alice", "PDF");
        eb.displayEBookDetails();
    }
}

class EBook extends Book {
    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayEBookDetails() {
        System.out.println("EBook ISBN: " + ISBN);   
        System.out.println("EBook Title: " + title);  
        System.out.println("Format: " + format);
        System.out.println("--------------------");
    }
}
