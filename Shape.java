import java.security.SecureRandom;

class Shape
{
    private int shapeId;
    public Shape()
    {
        setShapeId();
    }

    private void setShapeId()
    {
        shapeId = generateRandomId();
    }

    public int getShapeId()
    {
        return shapeId;
    }
    private int generateRandomId()
    {
        SecureRandom random = new SecureRandom();

        int randomId = 1000 +random.nextInt(10000);

        return randomId;
    }
}

