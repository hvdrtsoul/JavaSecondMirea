package prac6.factory;

public class ConcreteProduct extends Product{
    @Override
    public void makeProduct() {
        System.out.println("Created concrete product...");
    }
}
