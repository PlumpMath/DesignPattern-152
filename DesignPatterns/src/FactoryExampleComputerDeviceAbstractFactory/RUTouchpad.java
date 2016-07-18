package FactoryExampleComputerDeviceAbstractFactory;

public class RUTouchpad implements Touchpad {
    @Override
    public void track(int x, int y) {
        System.out.println(" Передвинуто на "+x + " пикселей горизонтально "+ y + " пикселей вертикально");
    }
}
