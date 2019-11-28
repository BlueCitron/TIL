package solution;

import problem.B.Mode;

public class Client {

    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        AlarmStartCommand alarmStartCommand = new AlarmStartCommand(alarm);

        Button buttonA = new Button(lampOnCommand);
        Button buttonB = new Button(alarmStartCommand);


        buttonA.pressed();
        buttonB.pressed();

        buttonB.setCommand(lampOnCommand);
        buttonB.pressed();


    }
}
