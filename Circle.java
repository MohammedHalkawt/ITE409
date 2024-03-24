public class Circle extends Shape{
    private int radius;

    public Circle(String color,point centerPoint,int radius) 
    {
        super(color,centerPoint,"Circle");
        setRadius(radius);        
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public double getArea(){

        return Math.PI * radius * radius;

    }

}
