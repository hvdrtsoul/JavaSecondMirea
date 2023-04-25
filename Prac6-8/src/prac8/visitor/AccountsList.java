package prac8.visitor;

import java.util.ArrayList;

public class AccountsList {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void acceptVisitor(Visitor visitor){
        for(Account account : accounts){
            account.accept(visitor);
        }
    }
}
