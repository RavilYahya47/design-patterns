package creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        configurationManager.loadConfiguration("config.properties");
    }
}
