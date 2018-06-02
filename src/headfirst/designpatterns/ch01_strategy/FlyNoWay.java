package headfirst.designpatterns.strategy;

/**
 * FlyNoWay
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Cannot fly");
    }
    
}