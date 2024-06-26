public class Square extends Shape
{

    private double area;
    private Point cornerOne, cornerTwo;

    public Square(Point cornerOne, Point cornerTwo, String color) 
    {
        super(color);
        this.cornerOne = cornerOne;
        this.cornerTwo = cornerTwo;
        setSize();
    }

   
    public double getSize()
    {
        return area;
    }

    public void setSize() {
        double sideLength = Math.sqrt(Math.pow(cornerTwo.x - cornerOne.x, 2) + Math.pow(cornerTwo.y - cornerOne.y, 2));
        area = sideLength * sideLength;
    }

    
    @Override
    public String toString()
    {
        return super.toString() + "\nSquare area: " + getSize();
    }

}
