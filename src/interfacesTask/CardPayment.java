package interfacesTask;

public class CardPayment implements PaymentSystem{
    @Override
    public void pay(double amount) {
        System.out.println("the card payment "+amount+"  is successfull");
    }

    @Override
    public void amountPayed(int amount) {

    }
}
