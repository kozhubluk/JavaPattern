package Task7.bridge;


public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("It is circle");
        this.color.fillColor();
    }
}
