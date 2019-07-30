public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape.setColor("orange");
        System.out.println(shape);

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);

        triangle.setColor("orange");
        System.out.println(triangle);
    }
}
