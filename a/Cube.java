public class Cube extends Shape {

    private double volume;
    private Point cornerOne, cornerTwo;
    public Cube(Point cornerOne, Point cornerTwo, String color, String type) 
    {
        super(color,type);
        this.cornerOne = cornerOne;
        this.cornerTwo = cornerTwo;
        setSize();
    }
   
    public void setSize() {
        double sideLength = Math.sqrt(Math.pow(cornerTwo.x - cornerOne.x, 2));
        volume = sideLength * sideLength * sideLength;
    }

    public double getSize()
    {
        return volume;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nCube volume: " + getSize();
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }

    

   

}
