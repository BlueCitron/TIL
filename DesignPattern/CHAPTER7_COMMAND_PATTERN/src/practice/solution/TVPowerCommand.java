package practice.solution;

import practice.TV;

public class TVPowerCommand implements Command {

    private TV tv;

    public TVPowerCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.power();
    }
}
