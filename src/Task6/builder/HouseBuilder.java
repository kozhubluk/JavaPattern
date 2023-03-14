package Task6.builder;

public class HouseBuilder implements Builder{
    House house = new House();
    @Override
    public void setWalls() {
        house.buildWalls();
    }

    @Override
    public void setRoof() {
        house.buildRoof();
    }

    @Override
    public void setGarage(boolean garage) {
        house.buildGarage(garage);
    }
}
