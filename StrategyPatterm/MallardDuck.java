package StrategyPatterm;

public class MallardDuck extends Duck {
    public MallardDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display () {
        System.out.println("Mallard StrategyPatterm.Duck");
    }
}
