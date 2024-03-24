import java.security.SecureRandom;

abstract class Shape11
{
    private int shapeId; //unique
    private String color;
    private String type;

    public Shape(String color, String type){
        initializeId();
        setColor(color);
        setType(type);
    }

   
    public int getId(){
        return this.shapeId;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    private void initializeId(){
        // make it unique//
        SecureRandom random = new SecureRandom();
        shapeId = 1000 +random.nextInt(10000);
    }


    public abstract void setSize();


    // @Override
    // public String toString()
    // {
    //     return "Shape color: " + getColor() + "\nShape type: " + getType();
    // }

}

