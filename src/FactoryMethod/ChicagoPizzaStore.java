package FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStylecheesePizza();
        } else return null;
    }
}
