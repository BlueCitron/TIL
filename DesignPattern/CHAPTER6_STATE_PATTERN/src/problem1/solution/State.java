package problem1.solution;

public interface State {
    public void OnButtonPushed(Light light);
    public void OffButtonPushed(Light light);
}
