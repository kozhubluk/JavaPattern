package Task8.chain;

public class PayPalPaymentHandler extends PaymentHandler {
    @Override
    public void Handle(Receiver receiver) {
        if (receiver.PayPalTransfer == true)
            System.out.println("Выполняем перевод через PayPal");
        else if (Successor != null)
            Successor.Handle(receiver);
    }
}
