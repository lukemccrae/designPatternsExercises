public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  public Duck() {
  }

  //these two methods allow the flyBehavior to be changed to whatever is passed in for fb2
  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
