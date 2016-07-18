package FactoryExampleComputerDeviceAbstractFactory;

public class RUMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Клик");
    }

    @Override
    public void dbclick() {
        System.out.println("Клик - Клик");

    }

    @Override
    public void scroll(int direction) {
        System.out.println("Перемешено на "+ direction+ " пикселей");

    }
}
