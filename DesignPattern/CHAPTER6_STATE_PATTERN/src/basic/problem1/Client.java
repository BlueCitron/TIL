package basic.problem1;

public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        System.out.println("PROBLEM 1");

        light.OffButtonPushed();
        light.OnButtonPushed();
        light.OnButtonPushed();
        light.OnButtonPushed();
        light.OffButtonPushed();
    }
}
