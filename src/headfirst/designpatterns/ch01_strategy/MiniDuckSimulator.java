package headfirst.designpatterns.strategy;

/**
 * MiniDuckSimulator
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
		Duck mallard = new Mallard();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyWithJetPack());
		model.performFly();

    }
}
