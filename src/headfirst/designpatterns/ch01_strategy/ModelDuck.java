package headfirst.designpatterns.strategy;

/**
 * ModelDuck
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("Looks like a Model Duck");
    }
    
}