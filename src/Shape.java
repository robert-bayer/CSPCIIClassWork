/** Defines a basic shape with just area
 *
 * @author Hyrum D. Carroll
 * @version 0.2 (10/05/2020)
 */
public class Shape{
    protected double area;

    public Shape(){ area = 0.0; }
    public Shape( double a ){ this.area = a; }
    public void setArea( double a ){ area = a; }
    public double getArea(){ return area; }
    public String toString(){
        return "Shape:\n\tarea: " + area;
    }
}

