package book;

public class DefaultDiscountStrategy implements DiscountStrategy {
    @Override
    public int discount(int price, int n) {
        return price * n;
    }
}
