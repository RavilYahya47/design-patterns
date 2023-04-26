package creational.abstract_factory;

public class BasicMouse implements Hardware {
    @Override
    public void create() {
        System.out.println("Create basic mouse");
    }
}