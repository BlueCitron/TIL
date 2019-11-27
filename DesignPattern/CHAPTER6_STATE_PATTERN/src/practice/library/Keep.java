package practice.library;

public class Keep implements BookState{

    private static Keep keep = new Keep();

    private Keep() {}

    public synchronized static Keep getInstance() {
        return keep;
    }

    @Override
    public void checkout(Book book) {
        throw new InvalidRentalOperationException("현재 상태에서 올바르지 않은 연산입니다.");
    }

    @Override
    public void checkin(Book book) {
        throw new InvalidRentalOperationException("현재 상태에서 올바르지 않은 연산입니다.");
    }

    @Override
    public void reserve(Book book) {
        throw new InvalidRentalOperationException("현재 상태에서 올바르지 않은 연산입니다.");
    }

    @Override
    public void cancel(Book book) {
        System.out.println("다음 책이 보관 중 예약이 취소되었습니다. " + book.getTitle());
        book.setState(Available.getInstance());
    }
}
