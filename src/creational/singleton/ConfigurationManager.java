package creational.singleton;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private ConfigurationManager() {}
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
    public void loadConfiguration(String configFilePath) {
        System.out.println("Loading configuration from " + configFilePath);
    }
}