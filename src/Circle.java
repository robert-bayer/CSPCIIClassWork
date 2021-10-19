public class Circle extends Shape{
    private double radius;

    public void setRadius(double r){
        radius = r;
        area = Math.PI * r * r;
    }

    public double getRadius(){
        return radius;
    }

    public String toString(){
        return "Shape:\n\tarea: " + area +"\n\tradius: " + radius;
    }
}
