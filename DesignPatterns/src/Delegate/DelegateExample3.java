package Delegate;

public class DelegateExample3 {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.performQuack();
        duck.performfly();
        duck.display();
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





