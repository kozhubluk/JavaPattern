package Task6.builder;

public class Director {
    public void simpleHouse(Builder builder){
        builder.setWalls();
        builder.setWalls();
        builder.setGarage(false);
    }

    public void garageHouse(Builder builder) {
        builder.setGarage(true);
        builder.setWalls();
        builder.setRoof();
    }
}
