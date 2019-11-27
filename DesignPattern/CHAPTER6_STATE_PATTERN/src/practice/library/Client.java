package practice.library;

public class Client {

    public static void main(String[] args) {
        Book book = new Book("반지의 제왕");

        // 예외
        try {
            book.cancel();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 정상
        book.checkout();
        book.checkin();
        book.checkout();
        book.reserve();
        book.checkin();
        book.cancel();
    }
}
