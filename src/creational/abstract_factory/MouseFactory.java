package creational.abstract_factory;

public class MouseFactory
{
    private MouseFactory() {}

    public static Hardware create(String type)
    {
        switch (type)
        {
            case "gaming":
                return new GamingMouse();
            case "basic":
                return new BasicMouse();
            default:
                throw new UnsupportedOperationException();
        }
    }
}