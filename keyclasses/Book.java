package keyclasses;

import java.lang.reflect.Array;
import java.util.List;

public class Book {
    private String bookName;
    private String authorName;
    private Integer isbn;
    public List<Book> gatheredBooks;

    public Book(String bookName, String authorName, Integer isbn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    void getBook(Book book){
        gatheredBooks.add(book);
    }

    void returnBook (Book book){
        gatheredBooks.remove(book);
    }

    public static void addBook (String bookName, String authorName, Integer Isbn){
        Book book = new Book (bookName, authorName, Isbn);
        //conn.createStatement().executeUpdate("INSERT books(bookName, bookAuthor, bookIsbn) VALUES ('Small funny book', 'Antony Joke', '223')");
    }

}
