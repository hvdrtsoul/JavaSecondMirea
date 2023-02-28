package prac8.visitor;

public class Company implements Account{
    private String name;
    private int id;
    private int budget;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getBudget() {
        return budget;
    }

    public Company(String name, int id, int budget) {
        this.name = name;
        this.id = id;
        this.budget = budget;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompanyAccount(this);
    }
}
