package Task6.factory;

public class ShipFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Ship();
    }
}
