public class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability = true;

    LibraryBook()
    {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    LibraryBook(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public void borrow( String name)
    {
        if(availability)
        {
            availability = false;
            System.out.println(name + " borrowed " + title + " by " + author);
        }
        else{
            System.out.println("Book not available");
        } 
    }
}
