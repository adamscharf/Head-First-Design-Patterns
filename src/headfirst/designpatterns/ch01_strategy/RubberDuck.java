package headfirst.designpatterns.strategy;

/**
 * RubberDuck
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("Looks like a Rubber Duck");
    }
    
}