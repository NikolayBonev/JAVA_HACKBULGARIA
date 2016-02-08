public class Point {
	private Double x;
	private Double y;
	
	public Point(){
		this(0, 0);
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Point(Point point){
		this(point.getX(), point.getY());
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return "Point(" + getX() + ", " + getY() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Point)){
			return false;
		}
		
		Point point = (Point) obj;
		
		if(point.hashCode() == this.hashCode()){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
        int hash = 17;
        hash = hash * 23 + x.hashCode();
        hash = hash * 23 + y.hashCode();
        return hash;
	}
	
	public static LineSegment add(Point point1, Point point2){
		return new LineSegment(point1, point2);
	}
}
