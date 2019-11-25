package book;

public class Member {
    private String name;
    private int totalRentalFee;

    public Member(String name) {
        this.name = name;
        this.totalRentalFee = 0;
    }

    public String getName() {
        return name;
    }

    public int getTotalRentalFee() {
        return totalRentalFee;
    }

    public void addTotalRentalFee(int price) {
        this.totalRentalFee += price;
    }
}
