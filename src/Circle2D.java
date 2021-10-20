public class Circle2D extends Shape2D{
    private double radius;

    public Circle2D(double radius){
        this.radius = radius;
    }

    @Override
    public double get2DArea() {
        return Math.round(Math.PI * radius * radius * 10.0) / 10.0;
    }
}
