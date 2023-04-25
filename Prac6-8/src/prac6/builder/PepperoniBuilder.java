package prac6.builder;

import prac6.abstract_factory.Pepperoni;
import prac6.abstract_factory.TomatoSauce;

public class PepperoniBuilder extends PizzaBuilder{
    @Override
    public void setTopping() {
        this.pizza.setTopping(new Pepperoni());
    }

    @Override
    public void setSauce() {
        this.pizza.setSauce(new TomatoSauce());
    }
}
