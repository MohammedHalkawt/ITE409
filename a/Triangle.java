public class Triangle extends Shape{

    private Point cornerOne, cornerTwo, cornerThree;
    private double area;
    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree, String color, String type) {
        super(color, type);
        this.cornerOne = cornerOne;
        this.cornerTwo = cornerTwo;
        this.cornerThree = cornerThree;
        setSize();
    }
    
    public double getSize()
    {
        return area;
    }

    public void setSize() {
        
        area = 0.5 * Math.abs((cornerOne.x * (cornerTwo.y - cornerThree.y) + cornerTwo.x * (cornerThree.y - cornerOne.y) + cornerThree.x * (cornerOne.y - cornerTwo.y)));
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nTriangle area: " + getSize();
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }
}