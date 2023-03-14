package Task6.factory;

public class TruckFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Truck();
    }
}
