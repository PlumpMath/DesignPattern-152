package CombiningExampleDucks;


public interface Quackable extends QuackObservable {
    String quackQuack = "QUACK";
    String squeakSqueak = "SQUEAK";
    String kwakKwak = "KWAK";


    void quack();
}
