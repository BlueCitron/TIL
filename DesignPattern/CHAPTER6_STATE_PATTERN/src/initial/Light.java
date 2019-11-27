package initial;

import common.LightState;

public class Light {
    private LightState lightState;

    public Light() {
        this.lightState = LightState.OFF;
    }

    public void OnButtonPushed() {
        if (lightState == LightState.ON) {
            System.out.println("Nothing happened.");
        } else {
            System.out.println("Light On!");
            this.lightState = LightState.ON;
        }
    }

    public void OffButtonPushed() {
        if (lightState == LightState.OFF) {
            System.out.println("Nothing happened.");
        } else {
            System.out.println("Light Off!");
            this.lightState = LightState.OFF;
        }
    }
}
