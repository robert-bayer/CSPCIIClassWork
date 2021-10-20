public class Shape2DDriver {

    public void displayArea(Shape2D shape){
        double area = shape.get2DArea();
        System.out.println(Math.round(area * 10) / 10);
    }
}
