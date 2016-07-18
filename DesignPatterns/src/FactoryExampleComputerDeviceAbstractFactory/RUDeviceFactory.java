package FactoryExampleComputerDeviceAbstractFactory;

public class RUDeviceFactory implements DeviceFactory{


    @Override
    public Mouse createMouse() {
        return new RUMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new RUKeyboard();
    }

    @Override
    public Touchpad createTouchpad() {
        return new RUTouchpad();
    }
}
