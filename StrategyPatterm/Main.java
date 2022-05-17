package StrategyPatterm;

public class Main {
    public static void main (String []args) {
//        StrategyPatterm.Duck mallardDuck = new StrategyPatterm.MallardDuck();
//        mallardDuck.performFly();
//        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
//        modelDuck.performQuack();
    }
}
