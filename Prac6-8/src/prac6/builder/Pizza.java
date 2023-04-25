package prac6.builder;

import prac6.abstract_factory.Sauce;
import prac6.abstract_factory.Topping;

public class Pizza {
    private Topping topping;

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    private Sauce sauce;

    public void eatPizza(){
        topping.tasteTopping();
        sauce.tasteSauce();
    }
}
