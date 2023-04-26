package creational.factory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza cheesePizza = pizzaFactory.createPizza(PizzaType.CHEESE);
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();

        Pizza pepperoniPizza = pizzaFactory.createPizza(PizzaType.PEPPERONI);
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();

        Pizza veggiePizza = pizzaFactory.createPizza(PizzaType.VEGGIE);
        veggiePizza.prepare();
        veggiePizza.bake();
        veggiePizza.cut();
        veggiePizza.box();
    }
}
