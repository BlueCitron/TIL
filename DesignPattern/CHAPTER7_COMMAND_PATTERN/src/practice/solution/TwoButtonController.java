package practice.solution;

public class TwoButtonController {

    private Command buttonACommand;
    private Command buttonBCommand;

    public TwoButtonController(Command buttonACommand, Command buttonBCommand) {
        this.buttonACommand = buttonACommand;
        this.buttonBCommand = buttonBCommand;
    }

    public void buttonAPressed() {
        buttonACommand.execute();
    }

    public void buttonBPressed() {
        buttonBCommand.execute();
    }
}
