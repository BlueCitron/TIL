package problem.A;

public class Button {

    private Alarm alarm;

    public Button(Alarm alarm) {
        this.alarm = alarm;
    }

    public void pressed() {
        alarm.start();
    }
}
