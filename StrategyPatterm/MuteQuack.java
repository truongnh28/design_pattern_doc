package StrategyPatterm;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quacking() {
        System.out.println("Mute StrategyPatterm.Quack");
    }
}
