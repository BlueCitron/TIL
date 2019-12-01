package stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("./test.db");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();

        } catch (Exception e) {

        }
    }

}
