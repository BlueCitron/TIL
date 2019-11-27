package problem1.solution;

public class Sleeping implements State {

    private static Sleeping sleeping = new Sleeping();

    private Sleeping() {}

    public synchronized static Sleeping getInstance() {
        return sleeping;
    }

    @Override
    public void OnButtonPushed(Light light) {
        System.out.println("Light On!");
        light.setState(On.getInstance());
    }

    @Override
    public void OffButtonPushed(Light light) {
        System.out.println("Light OFF!");
        light.setState(Off.getInstance());
    }
}
