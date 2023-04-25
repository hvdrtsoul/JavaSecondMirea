package prac6.builder;

import prac6.abstract_factory.PestoSauce;
import prac6.abstract_factory.Tomato;

public class PestoBuilder extends PizzaBuilder{
    @Override
    public void setTopping() {
        this.pizza.setTopping(new Tomato());
    }

    @Override
    public void setSauce() {
        this.pizza.setSauce(new PestoSauce());
    }
}
