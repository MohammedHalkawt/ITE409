public class Circle11 extends Shape{

    private Point center;
    private Point point;
    private double radius;
    private double area;

    public Circle11(Point center, Point point, String color, String type) {
        super(color, type);
        this.center = center;
        this.point = point;
        calculateRadius();
        setSize();
    }
    public Circle11(String color,String type)
    {
        super(color, type);
    }
    private void calculateRadius() {
        double dx = point.x - center.x;
        double dy = point.y - center.y;
        this.radius = Math.sqrt(dx * dx + dy * dy);
    }

    public void setSize(){
        this.area = Math.PI * radius * radius;

    }

    public double getSize() {
        return area;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nCircle area: " + getSize();
    }
}
