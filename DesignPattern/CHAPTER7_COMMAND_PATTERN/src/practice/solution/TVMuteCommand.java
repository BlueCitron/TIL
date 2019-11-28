package practice.solution;

import practice.TV;

public class TVMuteCommand implements Command {

    private TV tv;

    public TVMuteCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.mute();
    }
}
