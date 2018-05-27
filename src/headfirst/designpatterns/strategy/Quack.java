package headfirst.designpatterns.strategy;

/**
 * Quack
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}