package headfirst.designpatterns.strategy;

/**
 * FlyNoWay
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}