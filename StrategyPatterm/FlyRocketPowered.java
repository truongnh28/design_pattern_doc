package StrategyPatterm;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly Rocket Powered");
    }
}
