import java.security.SecureRandom;
import java.util.Scanner;

public class Shape
{
    private int shapeId;
    private String color;

    public Shape(String color)
    {
        setId();
        setColor(color);
    }

    private void setId()
    {
        shapeId = generateRandomId();
    }

    public int getId()
    {
        return shapeId;
    }

    private int generateRandomId()
    {
        SecureRandom random = new SecureRandom();

        int randomId = 1000 +random.nextInt(10000);

        return randomId;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    @Override
    public String toString()
    {
        
        return "Shape ID: " + getId() + "\nShape color: " + getColor();
    }

    public void setPosition()
    {
        return;
    }

    public void createShape()
    {
        Scanner input = new Scanner(System.in);
        System.err.println("Please enter the color of the shape: ");
        color = input.nextLine();

        System.out.println("Please enter type(Sphere, Cube, Circle, Square, Triangle): ");
        String type = input.nextLine();

        switch(type)
        {
            case "Sphere":
            Shape sphere = new Sphere(color);
                break;
            
            case "Cube":
            Shape cube = new Cube(color);
                break;

            case "Circle":
            Shape circle = new circle(color);
                break;

            case "Square":
            Shape square = new Square(color);
                break;
            
            case "Triangle":
            Shape triangle = new Triangle(color);
                break;
        }

    }
}

