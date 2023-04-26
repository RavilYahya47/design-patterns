package creational.abstract_factory;

public class BasicKeyboard implements Hardware{
    @Override
    public void create()
    {
        System.out.println("Create basic keyboard");
    }
}