package creational.factory;

public class PizzaFactory {
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case VEGGIE:
                return new VeggiePizza();
            default:
                return null;
        }
    }
}
