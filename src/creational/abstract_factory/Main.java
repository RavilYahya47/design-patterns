package creational.abstract_factory;

public class Main {
    public static void main(String[] args)
    {
        Hardware mouse = HardwareFactory.create("mouse", true);
        mouse.create();

        Hardware mouse2 = HardwareFactory.create("mouse", false);
        mouse2.create();

        Hardware keyboard = HardwareFactory.create("keyboard", true);
        keyboard.create();

        Hardware keyboard2 = HardwareFactory.create("keyboard", false);
        keyboard2.create();
    }
}
