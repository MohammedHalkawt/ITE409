public class Sphere extends Circle{
    
    private Point centerPoint, circumPoint;
    public Sphere(Point centerPoint,Point circumPoint,String color, String type){
        super(color,type);
        this.centerPoint = centerPoint;
        this.circumPoint = circumPoint;

    }

    @Override
    public double getRadius(){
        Point center = centerPoint;
        Point surface = circumPoint;
        System.out.println(surface);
        return Math.sqrt(
            Math.pow(surface.x - center.x, 2) + Math.pow(surface.y - center.y, 2) + Math.pow(surface.z - center.z, 2));

    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double getVolume(){
        return ((4.0 / 3) * Math.PI * Math.pow(this.getRadius(), 3)); // Volume of a sphere
    }

    public void setSize()
    {

    }
    @Override
    public String toString()
    {
        return super.toString() + "\nSphere area: " + getArea() + " and volume: " + getVolume();
    }
}
 