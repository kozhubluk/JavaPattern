package Task8.chain;

public class BankPaymentHandler extends PaymentHandler{
    @Override
    public void Handle(Receiver receiver) {
        if (receiver.BankTransfer == true)
            System.out.println("Выполняем банковский перевод");
        else if (Successor != null)
            Successor.Handle(receiver);
    }
}
