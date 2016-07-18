package FactoryExampleComputerDeviceAbstractFactory;

public class ENTouchpad implements Touchpad {
    @Override
    public void track(int x, int y) {
        System.out.println("moved on "+ x + " pixels horizontally " + y +" pixels vertically");
    }
}
