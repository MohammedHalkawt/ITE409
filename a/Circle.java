public class Circle extends Shape{
    private Point centerPoint;
    private Point circumPoint;

    public Circle(String color,Point centerPoint,Point circumPoint){
        super(color,"Circle");
        setCenterPoint(centerPoint);
        setCircumPoint(circumPoint);
    }
    public Circle(String color,Point centerPoint, Point circumPoint,String type){
        super(color,type);
        setCenterPoint(centerPoint);
        setCircumPoint(circumPoint);
    }

    public Circle(String color, String type) {
        super(color, type);
    }
    private void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    private Point setCircumPoint(Point circlePoint){
        return this.circumPoint;
    }

    public Point getCircumPoint() {
        return circumPoint;
    }

    public double getRadius(){
        return Math.sqrt(Math.pow(circumPoint.x - centerPoint.x, 2) + Math.pow(circumPoint.y - centerPoint.y, 2));

    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
//  /   @Override
//     public void setSize() {
//         throw new UnsupportedOperationException("Unimplemented method 'setSize'");
//     }

}
