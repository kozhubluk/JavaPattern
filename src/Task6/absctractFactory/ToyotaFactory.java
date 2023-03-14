package Task6.absctractFactory;

public class ToyotaFactory implements CarsFactory{

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }

    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }
}
