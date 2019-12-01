package stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("./test.db");

            while (true) {
                int a = is.read();
                if (a == -1) break;
                System.out.println(a);
            }
        } catch (Exception e) {

        }
    }
}
