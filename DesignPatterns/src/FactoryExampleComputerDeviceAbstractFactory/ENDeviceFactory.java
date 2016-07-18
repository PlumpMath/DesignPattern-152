package FactoryExampleComputerDeviceAbstractFactory;

public class ENDeviceFactory implements DeviceFactory {
    @Override
    public Mouse createMouse() {
        return new ENMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new ENKeyboard();
    }

    @Override
    public Touchpad createTouchpad() {
        return new ENTouchpad();

    }
}
