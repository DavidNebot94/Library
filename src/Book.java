public class Book  {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() { return name;}
    public String getAuthor() { return author;}
    public String getPrice() { return price;}
    public String getQtyInStock() { return qtyInStock;}
    public String getPrice() { this.price = price;}
    public String getQtyInStock() { this.qtyInStock = qtyInStock;}
    public String getAuthorName() { return author.getName();}
    public String getAuthorEmail() { return author.getEmail();}
    public char getAuthorGender() { return author.getGender();}
    public String toString() { return name + "by" + author;}


}

