package practice;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        TwoButtonController twoButtonController = new TwoButtonController(tv);

        twoButtonController.buttonBPressed();
        twoButtonController.buttonAPressed();
        twoButtonController.buttonBPressed();
        twoButtonController.buttonBPressed();
        twoButtonController.buttonAPressed();
    }
}
