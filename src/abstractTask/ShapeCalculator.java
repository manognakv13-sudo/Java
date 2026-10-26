package abstractTask;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape shape = new circle();
        Shape shape1 = new Rectangle(87.90);

        System.out.println(shape.calculateArea(90.00));
        System.out.println(shape1.calculateArea(909.00));
    }

}
