package book;

import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {
        Member defaultMember = new Member("DefaultMember");
        Member vipMember = new Member("VIPMember");

        Book defaultBook = new Book("DefaultBook", LocalDateTime.now(), 1000);
        Book overDecadeBook = new Book("OverDecadeBook", LocalDateTime.of(2009, 11, 25, 23, 7), 3000);
        Book expensiveBook = new Book("ExpensiveBook", LocalDateTime.now(), 4000);

        Rental rental = new Rental(defaultMember, defaultBook, new DefaultDiscountStrategy(), 1);
        Rental rental1 = new Rental(defaultMember, overDecadeBook, new OverDecadeDiscountStrategy(), 2);
        Rental rental2 = new Rental(vipMember, expensiveBook, new TotalOverTenThousandStrategy(), 10);

        System.out.println("Rental 1 : " + rental.getPrice());
        System.out.println("Rental 2 : " + rental1.getPrice());
        System.out.println("Rental 3 : " + rental2.getPrice());

    }
}
