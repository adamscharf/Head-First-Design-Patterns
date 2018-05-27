package headfirst.designpatterns.strategy;

/**
 * Squeak
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("squeak");
    }
}