package book;

public class OverDecadeDiscountStrategy implements DiscountStrategy{

    @Override
    public int discount(int price, int n) {
        return (int)(price * n * 0.9);
    }
}
