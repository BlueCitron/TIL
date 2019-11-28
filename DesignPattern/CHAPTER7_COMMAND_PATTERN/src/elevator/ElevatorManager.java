package elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {

    private int controllerCount;
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        this.controllerCount = controllerCount;
        this.controllers = new ArrayList<>();
    }

    public void addController(ElevatorController controller) {
        controllers.add(controller);
    }

}
