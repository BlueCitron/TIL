package practice.library;

public class Available implements BookState{

    private static Available available = new Available();

    private Available() {}

    public synchronized static Available getInstance() {
        return available;
    }


    @Override
    public void checkout(Book book) {
        System.out.println("다음 책이 대출되었습니다: " + book.getTitle());
        book.setState(OnRent.getInstance());
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
        throw new InvalidRentalOperationException("현재 상태에서 올바르지 않은 연산입니다.");
    }
}
