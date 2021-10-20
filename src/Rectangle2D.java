public class Rectangle2D extends Shape2D{
    protected double length;
    protected double width;

    public Rectangle2D(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double get2DArea() {
        return length * width;
    }
}
