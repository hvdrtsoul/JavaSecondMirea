package prac7.facade;

public class CashierFacade {
    OrderManager orderManager;
    PaymentManager paymentManager;
    UserAccountManager userAccountManager;

    public CashierFacade(OrderManager orderManager, PaymentManager paymentManager, UserAccountManager userAccountManager) {
        this.orderManager = orderManager;
        this.paymentManager = paymentManager;
        this.userAccountManager = userAccountManager;
    }

    public void makeOrder(){
        paymentManager.proceedPayment();
        orderManager.addOrder();
        userAccountManager.addCoins();
    }

    public void makeCoinOrder(){
        userAccountManager.useCoins();
        orderManager.addOrder();
    }
}
