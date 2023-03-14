package Task7.bridge;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("It is triangle");
        this.color.fillColor();
    }
}