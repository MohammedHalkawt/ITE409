
public class Sphere11 extends Shape{
    private double radius;
    private double volume;
    private double centerX,centerY,centerZ;
    private double pointX,pointY,pointZ;

    public Sphere11(double centerX, double centerY, double centerZ, double pointX, double pointY, double pointZ, String color, String type) {
        super(color, type);
        this.centerX = centerX;
        this.centerY = centerY;
        this.centerZ = centerZ;
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
        calculateRadius();
        setSize();
    }

    private void calculateRadius() {
        double dx = pointX - centerX;
        double dy = pointY - centerY;
        double dz = pointZ - centerZ;
        this.radius = Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public void setSize() {
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSize() {
        return volume;
    }

    // @Override
    // public String toString()
    // {
    //     return super.toString() + "\nSphere volume: " + getSize();
    // }
}