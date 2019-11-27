package problem1;

import common.LightState;

public class Light {
    private LightState lightState;

    public Light() {
        this.lightState = LightState.OFF;
    }

    public void OnButtonPushed() {
        if (lightState == LightState.ON) {
            System.out.println("취침등 상태");
            this.lightState = LightState.SLEEPING;
        } else if (lightState == LightState.SLEEPING){
            System.out.println("Light On!");
            this.lightState = LightState.ON;
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
