package FactoryExampleComputerDeviceAbstractFactory;

public class MainTest {
    public static void main(String[] args) {
        DeviceFactory factory = new RUDeviceFactory();
        DeviceFactory factory1 = new ENDeviceFactory();

        Mouse mouse = factory.createMouse();

        Touchpad touchpad = factory.createTouchpad();
        touchpad.track(1,66);
        touchpad = factory1.createTouchpad();
        mouse.click();
        touchpad.track(1,44);

    }
}
