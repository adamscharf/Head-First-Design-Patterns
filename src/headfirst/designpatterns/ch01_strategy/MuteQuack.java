package headfirst.designpatterns.strategy;

/**
 * MuteQuack
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< silence >>");
    }
}