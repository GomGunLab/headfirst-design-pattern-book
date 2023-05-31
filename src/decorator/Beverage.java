package decorator;

public abstract class Beverage {
    String description = "no description";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
