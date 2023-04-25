package prac8.template_method;

public class TurkishLatteCoffeeMaker extends AbstractCoffeeMaker{
    @Override
    protected void makeBase() {
        System.out.println("[Turkish Latte Maker] Making base turkish coffee...");
    }

    @Override
    protected void addToppings() {
        System.out.println("[Turkish Latte Maker] Adding sugar...");
        System.out.println("[Turkish Latte Maker] Adding milk...");
    }
}
