package Delegate;

public class DelegateExample3 {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.performQuack();
        duck.performfly();
        duck.display();

        Duck duck1 = new ModelDuck();
        duck.performfly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performfly();

    }
}


interface FlyBehavior{
     void fly();
}
class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("I'm flying =)))");
    }
}
class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I can not fly(((");
    }
}
class FlyRocketPowered implements FlyBehavior{
    public void fly() {
        System.out.println("ROCKET FLY");
    }
}

interface QuackBehavior{
    void quack();
}
class Quack implements QuackBehavior{
    public void quack() { System.out.println("Quack Quack");}
}
class QuackMute implements QuackBehavior{
    public void quack() { System.out.println("---------");}
}
class Squack implements QuackBehavior{
    public void quack() {System.out.println("SQUACK");}
}

abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}
    public abstract void display();
    public void performfly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("all ducks can swim");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

}
class MallarDuck extends Duck{
    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("MallarDuck quack and fly");
    }
}
class ModelDuck extends Duck{
    public ModelDuck(){

        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I'm model duck");
    }
}




