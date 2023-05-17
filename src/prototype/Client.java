package Prototype;

public class Client {
    private Prototype prototype;
    private Product product;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public String operation() {
        product = prototype.clone();
        return "Client: Cloning " + product.getClass().getSimpleName() + ".\n" + product.getName() + " object copied.";
    }
}
