package headfirst.designpatterns.strategy;

/**
 * Mallard
 */
public class Mallard extends Duck {
    public Mallard() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Looks like a Mallard");
    }
    
}