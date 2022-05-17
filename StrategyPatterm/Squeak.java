package StrategyPatterm;

public class Squeak implements QuackBehavior{
    @Override
    public void quacking() {
        System.out.println("StrategyPatterm.Squeak");
    }
}
