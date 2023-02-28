package prac8.visitor;

public class User implements Account{
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitUserAccount(this);
    }
}
