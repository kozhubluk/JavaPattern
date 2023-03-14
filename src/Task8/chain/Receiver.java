package Task8.chain;

public class Receiver {
    public boolean BankTransfer;
    public boolean MoneyTransfer;
    public boolean PayPalTransfer;

    public Receiver(boolean bt, boolean mt, boolean ppt)
    {
        BankTransfer = bt;
        MoneyTransfer = mt;
        PayPalTransfer = ppt;
    }
}
