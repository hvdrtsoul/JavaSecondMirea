package prac6.builder;

public abstract class PizzaBuilder {
    public Pizza pizza;

    public void makePizza(){
        pizza = new Pizza();
    }

    public abstract void setTopping();
    public abstract void setSauce();
}
