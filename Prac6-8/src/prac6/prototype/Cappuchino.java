package prac6.prototype;

public class Cappuchino implements Cloneable {
    private enum MilkLevel{
        LOW_MILK, MEDIUM_MILK, HIGH_MILK
    }

    private enum SugarLevel{
        NO_SUGAR, LOW_SUGAR, MEDIUM_SUGAR, HIGH_SUGAR
    }

    private enum SyrupType{
        LAVENDER_SYRUP, GINGER_SYRUP, CHOCOLATE_SYRUP
    }

    private MilkLevel milkLevel;
    private SugarLevel sugarLevel;
    private SyrupType syrupType;

    public Cappuchino(MilkLevel milkLevel, SugarLevel sugarLevel, SyrupType syrupType) {
        this.milkLevel = milkLevel;
        this.sugarLevel = sugarLevel;
        this.syrupType = syrupType;
    }

    @Override
    public Cloneable clone() {
        return new Cappuchino(this.milkLevel, this.sugarLevel, this.syrupType);
    }
}
