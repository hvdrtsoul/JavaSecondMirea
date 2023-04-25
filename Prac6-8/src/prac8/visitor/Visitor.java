package prac8.visitor;

public interface Visitor{
    public void visitCompanyAccount(Company company);
    public void visitUserAccount(User user);
}
