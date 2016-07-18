package FactoryExampleComputerDeviceAbstractFactory;

public class RUKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.print("Печать без перевода строки ");
    }

    @Override
    public void println() {
        System.out.println("Печать с переводом строки");

    }
}
