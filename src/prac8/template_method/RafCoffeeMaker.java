package prac8.template_method;

public class RafCoffeeMaker extends AbstractCoffeeMaker{
    @Override
    protected void makeBase() {
        System.out.println("[Raf Maker] Making americano...");
    }

    @Override
    protected void addToppings() {
        System.out.println("[Raf Maker] Adding a lot of milk and cream on top...");
        System.out.println("[Raf Maker] Adding syrup...");
    }
}
