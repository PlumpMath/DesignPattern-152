package FactoryExampleComputerDeviceAbstractFactory;

public interface DeviceFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
    Touchpad createTouchpad();
}
