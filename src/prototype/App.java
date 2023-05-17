package Prototype;

public class App {
    public static void main(String[] args) {
        Client client = new Client(new Product1("Product1"));
        System.out.println(client.operation());
    }
}
