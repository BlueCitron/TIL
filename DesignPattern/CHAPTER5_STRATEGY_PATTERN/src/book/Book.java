package book;

import java.time.LocalDateTime;

public class Book {
    private String title;
    private LocalDateTime publishDate;
    private int price;

    public Book(String title, LocalDateTime publishDate, int price) {
        this.title = title;
        this.publishDate = publishDate;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
