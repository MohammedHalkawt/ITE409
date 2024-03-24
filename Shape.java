import java.security.SecureRandom;

abstract class Shape
{
    private int shapeId;
    private String color;
    private point centerPoint;
    private String type;

    public Shape(String color, point center, String type)
    {
        initializeId();
        setColor(color);
        setCenterPoint(center);
        setType(type);
    }

    private void setCenterPoint(point centerPoint){
        this.centerPoint = centerPoint;
    }

    public point getCenterPoint()
    {
        return this.centerPoint;
    }

    private void initializeId()
    {
        SecureRandom random = new SecureRandom();
        shapeId = 1000 +random.nextInt(10000);
    }

    public int getId()
    {
        return this.shapeId;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public abstract double getArea();

    public void print()
    {
        
    }
}

