public class Rectangle2D extends Shape2D{
    private double length;
    private double width;

    public Rectangle2D(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double get2DArea() {
        return Math.round(length * width * 10.0) / 10.0;
    }
}
