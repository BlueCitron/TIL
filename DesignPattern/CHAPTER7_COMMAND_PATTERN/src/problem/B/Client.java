package problem.B;

public class Client {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Alarm alarm = new Alarm();
        Button button = new Button(lamp, alarm);

        // 램프 모드
        button.setMode(Mode.LAMP);
        button.pressed();

        // 알람 모드
        button.setMode(Mode.ALARM);
        button.pressed();
    }
}
