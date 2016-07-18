package FactoryExampleComputerDeviceAbstractFactory;

public class ENKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("just print");
    }

    @Override
    public void println() {
        System.out.println("print new line");
    }
}
