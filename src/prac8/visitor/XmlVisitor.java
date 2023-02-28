package prac8.visitor;

public class XmlVisitor implements Visitor {
    @Override
    public void visitCompanyAccount(Company company) {
        String result = "<Company><Name>" + company.getName() + "</Name><Id>" + company.getId() + "</Id><Budget>" +
                company.getBudget() + "</Budget></Company>";
        System.out.println(result);
    }

    @Override
    public void visitUserAccount(User user) {
        String result = "<User><Name>" + user.getName() + "</Name><Id>" + user.getId() + "</Id></User>";
        System.out.println(result);
    }
}
