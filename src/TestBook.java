public class TestBook {
    public static void main(String args[]) {
        Author anAuthor = new Author("David Nebot", "david@email.com", "m");
        Book aBook = new Book("El fin", "20.99", "50");
        Book anotherBook = new Book ("James","james@email.com","F","29.00","88");
        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println(anotherBook);
        Book[] bookArray = new Book[5];
        Author haruki = new Author("Pablo","pablo@email.com","M");
        bookArray[0] = new Book("olas","Pablo","15");
        bookArray[1] = new Book("monstruo","Pablo","20");
        bookArray[2] = new Book("aire","Pablo","22");
        bookArray[3] = new Book("españa","Pablo","17");
        bookArray[4] = new Book("europa","Pablo","27");
        for (Book bookArray1 : bookArray) {
            System.out.println(bookArray1.toString());
        }
    }
}
