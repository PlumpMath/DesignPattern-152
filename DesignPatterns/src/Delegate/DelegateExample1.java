package Delegate;

public class DelegateExample1 {

    public static void main(String[] args) {
        B b = new B();
        b.f();
    }
}


class B{
    A a = new A();

    public void f(){
        a.f();
    }
}

class A{
    public void f(){
        System.out.println("A: f()");
    }
}