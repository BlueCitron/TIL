package practice.library;

public interface BookState {
    public void checkout(Book book);
    public void checkin(Book book);
    public void reserve(Book book);
    public void cancel(Book book);
}
