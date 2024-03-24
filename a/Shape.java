import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

abstract class Shape {
    private static final Set<Integer> usedIDs = new HashSet<>();
    private int shapeId; 
    private String color;
    private String type;

    public Shape(String color, String type) {
        setId();
        setColor(color);
        setType(type);
    }

    public int getId() {
        return this.shapeId;
    }

    public void setColor(String color) {
        this.color = color;
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

    public abstract double getArea();

    @Override
    public String toString()
    {
        return "Shape color: " + getColor() + "\nShape type: " + getType();
    }
}
