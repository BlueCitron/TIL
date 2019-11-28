package practice;

public class TwoButtonController {
    private TV tv;

    public TwoButtonController(TV tv) {
        this.tv = tv;
    }

    public void buttonAPressed() {
        tv.power();
    }

    public void buttonBPressed() {
        tv.mute();
    }
}
