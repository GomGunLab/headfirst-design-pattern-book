package Prototype;

public class Product1 implements Product, Prototype {
    private String name;

    public Product1(String name) {
        this.name = name;
    }

    public Product1(Product1 p) {
        this.name = p.getName();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Product clone() {
        return new Product1(this);
    }
}
