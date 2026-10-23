package interfacesTask;

public class UPIPayment implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("the upi payment "+amount +" successfull");
    }

    @Override
    public void amountPayed(int amount) {

    }
}
