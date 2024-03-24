import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

abstract class Shape {
    private static final Set<Integer> usedIDs = new HashSet<>();
    private int shapeId; 
    private String color;
    private String type;

    Scanner inputs = new Scanner(System.in);

    public Shape(String color) {
        setId();
        setType(type);
        try {
            setColor(color);
        } catch (EmptyColorException ex) {
            System.out.println(ex);
        }
    }

    public int getId() {
        return this.shapeId;
    }

    public void setColor(String color) throws EmptyColorException{
        if(color.trim().isEmpty())
        {
            this.color = "default color white";
            throw new EmptyColorException();
        }
        else
        {
            this.color = color;

        }
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    private void setId() {
        do {
            this.shapeId = generateRandomID();
        } while (!usedIDs.add(this.shapeId));
    }

    private int generateRandomID() {
        SecureRandom random = new SecureRandom();
        return 1000 + random.nextInt(9000); 
    }

    public abstract double getSize();


    @Override
    public String toString()
    {
        return "Shape color: " + getColor() + "\nShape type: " + getType();
    }
    
}
