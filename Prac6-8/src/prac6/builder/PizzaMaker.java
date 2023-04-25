package prac6.builder;

public class PizzaMaker {
    public Pizza makePizza(PizzaBuilder pizzaBuilder){
        pizzaBuilder.makePizza();
        pizzaBuilder.setTopping();
        pizzaBuilder.setSauce();

        return pizzaBuilder.pizza;
    }
}
