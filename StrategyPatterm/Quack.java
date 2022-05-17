package StrategyPatterm;

public class Quack implements QuackBehavior{
    @Override
    public void quacking() {
        System.out.println("StrategyPatterm.Quack");
    }
}
