package book;

public class Rental {
    private Member member;
    private Book book;
    private DiscountStrategy discountStrategy;
    private int n;
    private int price;

    public Rental(Member member, Book book, DiscountStrategy discountStrategy, int n) {
        this.member = member;
        this.book = book;
        this.discountStrategy = discountStrategy;
        this.n = n;
        this.price = discountStrategy.discount(book.getPrice(), n);
    }

    public int getPrice() {
        return price;
    }
}
