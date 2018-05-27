package headfirst.designpatterns.strategy;

/**
 * MiniDuckSimulator
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
		Mallard	mallard = new Mallard();
		RubberDuck rubberDucky = new RubberDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDucky.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyWithJetPack());
		model.performFly();
    }
}
