package Task7.bridge;

public class Main {
    public static void main(String[] args) {
        testShape(new Red());
        System.out.println();
        testShape(new Blue());
    }
    public static void testShape(Color color) {
        Triangle triangle = new Triangle(color);
        triangle.draw();
        Circle circle = new Circle(color);
        circle.draw();
    }
}
