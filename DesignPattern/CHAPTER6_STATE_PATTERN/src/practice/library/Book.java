package practice.library;

public class Book {
    private String title;
    private BookState state;

    public Book(String title) {
        this.title = title;
        this.state = Available.getInstance();
    }

    public String getTitle() {
        return title;
    }

    public void setState(BookState state) {
        this.state = state;
    }

    public void checkout() {
        this.state.checkout(this);
    }

    public void checkin() {
        this.state.checkin(this);
    }

    public void reserve() {
        this.state.reserve(this);
    }

    public void cancel() {
        this.state.cancel(this);
    }
}
