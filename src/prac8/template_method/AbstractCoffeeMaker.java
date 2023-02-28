package prac8.template_method;

public abstract class AbstractCoffeeMaker {
    public void makeCoffee(){
        makeBase();
        addToppings();
    }

    protected abstract void makeBase();
    protected abstract void addToppings();
}
