package problem1.solution;

import common.LightState;

public class Light {
    private State state;

    public Light() {
        this.state = Off.getInstance();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void OnButtonPushed() {
        this.state.OnButtonPushed(this);
    }

    public void OffButtonPushed() {
        this.state.OffButtonPushed(this);
    }
}
