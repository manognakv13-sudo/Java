package interfacesTask;

public class Pay {
    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment();
        cardPayment.pay(300000.00);

        UPIPayment upiPayment = new UPIPayment();
        upiPayment.pay(300000.00);


    }
}
