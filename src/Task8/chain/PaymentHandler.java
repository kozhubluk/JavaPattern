package Task8.chain;

public abstract class PaymentHandler {
    public PaymentHandler Successor;
    public abstract void Handle(Receiver receiver);
}
