package prac8.template_method;

public class LatteCoffeeMaker extends AbstractCoffeeMaker{
    @Override
    protected void makeBase() {
        System.out.println("[Latte Maker] Making americano...");
    }

    @Override
    protected void addToppings() {
        System.out.println("[Latte Maker] Adding a lot of milk...");
    }
}
