package basic.problem1.solution;

public class On implements State {

    private static On on = new On();

    private On() {}

    public synchronized static On getInstance() {
        return on;
    }

    @Override
    public void OnButtonPushed(Light light) {
        System.out.println("Light Sleeping!");
        light.setState(Sleeping.getInstance());
    }

    @Override
    public void OffButtonPushed(Light light) {
        System.out.println("Light Off!");
        light.setState(Off.getInstance());
    }
}
