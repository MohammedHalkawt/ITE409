public class Triangle extends Shape{

    private Point cornerOne, cornerTwo, cornerThree;
    private double area;
    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree, String color) {
        super(color);
        this.cornerOne = cornerOne;
        this.cornerTwo = cornerTwo;
        this.cornerThree = cornerThree;
        setSize();
    }
    
    @Override
    public double getSize()
    {
        return area;
    }

    public void setSize() {
        
        try{
            area = 0.5 * Math.abs((cornerOne.x * (cornerTwo.y - cornerThree.y) + cornerTwo.x * (cornerThree.y - cornerOne.y) + cornerThree.x * (cornerOne.y - cornerTwo.y)));
            if(area == 0)
            {
                throw new TriangleException();
            }
        }catch(TriangleException x)
        {
            System.err.println(x);
        }
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nTriangle area: " + getSize();
    }
}
