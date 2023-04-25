package prac8.visitor;

public class JsonVisitor implements Visitor{
    @Override
    public void visitCompanyAccount(Company company) {
        String result = "company:{name:\"" + company.getName() + "\", id:\"" + company.getId() + "\", budget:\"" + company.getBudget() + "\"}";
        System.out.println(result);
    }

    @Override
    public void visitUserAccount(User user) {
        String result = "user:{name:\"" + user.getName() + "\", id:\"" + user.getId() + "\"}";
        System.out.println(result);
    }
}
