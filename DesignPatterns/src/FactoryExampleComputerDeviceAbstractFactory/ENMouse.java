package FactoryExampleComputerDeviceAbstractFactory;


public class ENMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void dbclick() {
        System.out.println("Click - Click");
    }

    @Override
    public void scroll(int direction) {
        System.out.println("Moved to "+ direction+ "pixels");
    }
}
