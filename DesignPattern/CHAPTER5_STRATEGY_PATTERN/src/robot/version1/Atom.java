package robot.version1;

public class Atom extends Robot {

    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I have a strong punch and can attack with it.");
    }

    @Override
    public void move () {
        System.out.println("I can fly.");
    }
}
