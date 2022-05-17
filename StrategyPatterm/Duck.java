package StrategyPatterm;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior (FlyBehavior fb) {
        this.flyBehavior = fb;
    }
    public void setQuackBehavior (QuackBehavior qb) {
        this.quackBehavior = qb;
    }
    public void performQuack () {
        quackBehavior.quacking();
    }
    public void performFly () {
        flyBehavior.fly();
    }
    public void swim () {
        System.out.println("Swim");
    }
}
