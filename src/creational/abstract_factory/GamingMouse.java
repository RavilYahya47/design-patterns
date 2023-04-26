package creational.abstract_factory;

public class GamingMouse implements Hardware{
    @Override
    public void create()
    {
        System.out.println("Create gaming mouse");
    }
}