package Task6.factory;

public class Ship implements Product {

    @Override
    public void deliver() {
        System.out.println("Deliver by ship");
    }
}
