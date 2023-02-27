package prac6.abstract_factory;

public class PepperoniPartsFactory extends PizzaPartFactory{
    @Override
    public Topping makeTopping() {
        return new Pepperoni();
    }

    @Override
    public Sauce makeSauce() {
        return new TomatoSauce();
    }
}
