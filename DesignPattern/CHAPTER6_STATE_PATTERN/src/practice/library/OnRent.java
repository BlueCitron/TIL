package practice.library;

public class OnRent implements BookState {

    private static OnRent onRent = new OnRent();

    private OnRent() {}

    public synchronized static OnRent getInstance() {
        return onRent;
    }

    @Override
    public void checkout(Book book) {
        throw new InvalidRentalOperationException("현재 상태에서 올바르지 않은 연산입니다.");
    }

    @Override
    public void checkin(Book book) {
        System.out.println("다음 책이 반납 되었습니다. : " + book.getTitle());
        book.setState(Available.getInstance());
    }

    @Override
    public void reserve(Book book) {
        System.out.println("다음 책이 예약 되었습니다. : " + book.getTitle());
        book.setState(OnReserve.getInstance());
    }

    @Override
    public void cancel(Book book) {
        throw new InvalidRentalOperationException("현재 상태에서 올바르지 않은 연산입니다.");
    }
}
