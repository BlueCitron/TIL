package practice.library;

public class OnReserve implements BookState {

    private static OnReserve onReserve = new OnReserve();

    private OnReserve() {}

    public synchronized static OnReserve getInstance() {
        return onReserve;
    }

    @Override
    public void checkout(Book book) {
        throw new InvalidRentalOperationException("현재 상태에서 올바르지 않은 연산입니다.");
    }

    @Override
    public void checkin(Book book) {
        System.out.println("다음 책을 예약자를 위해 보관합니다. : " + book.getTitle());
        book.setState(Keep.getInstance());
    }

    @Override
    public void reserve(Book book) {
        throw new InvalidRentalOperationException("현재 상태에서 올바르지 않은 연산입니다.");
    }

    @Override
    public void cancel(Book book) {
        System.out.println("다음 책의 예약이 취소되었습니다. : " + book.getTitle());
        book.setState(OnRent.getInstance());
    }
}
