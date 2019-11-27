package basic.problem1.solution;

public class Off implements State {

    private static Off off = new Off();

    private Off() {}

    public synchronized static Off getInstance() {
        return off;
    }


    @Override
    public void OnButtonPushed(Light light) {
        System.out.println("Light On!");
        light.setState(On.getInstance());
    }

    @Override
    public void OffButtonPushed(Light light) {
        System.out.println("반응 없음");
    }
}
