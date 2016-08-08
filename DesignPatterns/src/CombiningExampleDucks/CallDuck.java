package CombiningExampleDucks;




public class CallDuck implements Quackable {

    Observable observable;

    public CallDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println(kwakKwak);
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "CallDuck";
    }
}
