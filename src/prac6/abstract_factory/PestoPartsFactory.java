package prac6.abstract_factory;

public class PestoPartsFactory extends PizzaPartFactory{
    @Override
    public Topping makeTopping() {
        return new Tomato();
    }

    @Override
    public Sauce makeSauce() {
        return new PestoSauce();
    }
}
