package creational.abstract_factory;

public class KeyboardFactory
{
    private KeyboardFactory() {}

    public static Hardware create(String type)
    {
        switch (type)
        {
            case "gaming":
                return new GamingKeyboard();
            case "basic":
                return new BasicKeyboard();
            default:
                throw new UnsupportedOperationException();
        }
    }

}