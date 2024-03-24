public class Cube extends Shape {

    public Cube(String color) 
    {
        super(color);
        System.out.println("Please provide the coordinates of the shape");
        
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nShape Position: " + getPosition();
    }

    public void setPosition(double x, double y, double z)
    {
        
    }
    public String getPosition()
    {
        return "a";
    }

}
