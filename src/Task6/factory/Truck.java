package Task6.factory;

public class Truck implements Product{
    @Override
    public void deliver() {
        System.out.println("Deliver by truck");
    }
}
