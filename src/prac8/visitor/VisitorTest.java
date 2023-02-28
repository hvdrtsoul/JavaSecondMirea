package prac8.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Company paradiseCompany = new Company("Paradise co.", 0, 999999999);
        User furkanUser = new User("Furkan Duyan", 1);

        AccountsList allAccounts = new AccountsList();
        allAccounts.addAccount(paradiseCompany);
        allAccounts.addAccount(furkanUser);

        JsonVisitor jsonVisitor = new JsonVisitor();
        XmlVisitor xmlVisitor = new XmlVisitor();

        allAccounts.acceptVisitor(jsonVisitor);
        allAccounts.acceptVisitor(xmlVisitor);


    }
}
