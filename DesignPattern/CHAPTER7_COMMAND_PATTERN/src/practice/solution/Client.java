package practice.solution;

import practice.TV;

import javax.crypto.spec.RC2ParameterSpec;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        Command tvPowerCommand = new TVPowerCommand(tv);
        Command tvMuteCommand = new TVMuteCommand(tv);

        TwoButtonController rcA = new TwoButtonController(tvPowerCommand, tvPowerCommand);
        TwoButtonController rcB = new TwoButtonController(tvPowerCommand, tvMuteCommand);
        TwoButtonController rcC = new TwoButtonController(tvMuteCommand, tvPowerCommand);
        TwoButtonController rcD = new TwoButtonController(tvMuteCommand, tvMuteCommand);

        rcA.buttonAPressed();
        rcA.buttonBPressed();
        rcA.buttonBPressed();
        rcA.buttonAPressed();
        System.out.println("--------------------------");
        rcB.buttonAPressed();
        rcB.buttonBPressed();
        rcB.buttonBPressed();
        rcB.buttonAPressed();
        System.out.println("--------------------------");
        rcC.buttonAPressed();
        rcC.buttonBPressed();
        rcC.buttonBPressed();
        rcC.buttonAPressed();
        System.out.println("--------------------------");
        rcD.buttonAPressed();
        rcD.buttonBPressed();
        rcD.buttonBPressed();
        rcD.buttonAPressed();

    }
}
