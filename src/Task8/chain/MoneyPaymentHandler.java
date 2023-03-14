package Task8.chain;

public class MoneyPaymentHandler extends PaymentHandler{
    @Override
    public void Handle(Receiver receiver) {
        if (receiver.MoneyTransfer == true)
            System.out.println("Выполняем денежный перевод");
        else if (Successor != null)
            Successor.Handle(receiver);
    }
}
