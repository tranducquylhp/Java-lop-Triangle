public class Triangle extends Shape {
    public double size1 = 1;
    public double size2 = 1;
    public double size3 = 1;

    public Triangle() {
    }

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return this.size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return this.size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return this.size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getArea() {
        double p = (size1 + size2 + size3) / 2;
        return Math.sqrt(p * (p - size1) * (p - size2) * (p - size3));
    }

    public double getPerimeter() {
        return size1 + size2 + size3;
    }

    @Override
    public String toString() {
        return "A Triangle with color of " + color + ", size1 = " + size1 + ", size2 = " + size2 + ", size3 = " + size3 +
                ", Perimeter = " + this.getPerimeter() + ", Area = " + this.getArea() + ", which is subclass of " + super.toString();
    }
}
