import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("./test.text");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);
            ps.print("Hello World");
        } catch (Exception e) {

        }
    }
}
