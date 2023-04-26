package creational.abstract_factory;

public class GamingKeyboard implements Hardware{
    @Override
    public void create()
    {
        System.out.println("Create gaming keyboard");
    }
}