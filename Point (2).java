public class Point {
    public int x;
    public int y;
    public int z;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object coordinate) {
        if (this == coordinate) {
            return true;
        }
        if (coordinate == null || getClass() != coordinate.getClass()) {
            return false;
        }

        Point other = (Point) coordinate;
        return x == other.x && y == other.y && z == other.z;
    }
}

    
   
