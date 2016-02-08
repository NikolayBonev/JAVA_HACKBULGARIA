
public class Triangle implements Shape{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle(Point pointA, Point pointB, Point pointC){
		if(pointA.getX() == pointB.getX() && pointA.getX() == pointC.getX()){
			System.out.println("Points are on the same axis.");
			return;
		}else if(pointA.getY() == pointB.getY() && pointA.getY() == pointC.getY()){
			System.out.println("Points are on the same axis.");
			return;
		}
		
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
	public Triangle(Triangle triangle){
		this(triangle.pointA, triangle.pointB, triangle.pointC);
	}

	public Point getPointA() {
		return this.pointA;
	}

	public Point getPointB() {
		return this.pointB;
	}

	public Point getPointC() {
		return this.pointC;
	}
	
	public LineSegment getSideAB(){
		LineSegment line = new LineSegment(this.pointA, this.pointB);
		
		return line;
	}
	
	public LineSegment getSideAC(){
		LineSegment line = new LineSegment(this.pointA, this.pointC);
		
		return line;
	}
	
	public LineSegment getSideBC(){
		LineSegment line = new LineSegment(this.pointB, this.pointC);
		
		return line;
	}
	
	public double getBase(){
		return getSideAB().getLength();
	}
	
	public double getHeight(){
		double height = 2*this.getArea()/this.getSideAB().getLength();
		
		return height;
	}
	
	public double getPerimeter(){
		double perimeter = this.getSideAB().getLength() + this.getSideAC().getLength() + this.getSideBC().getLength();
		
		return perimeter;
	}
	
	public double getArea(){
		double halfPerimeter = this.getPerimeter()/2;
		
		double area = Math.sqrt(halfPerimeter*(halfPerimeter - this.getSideAB().getLength())*(halfPerimeter - this.getSideAC().getLength())*(halfPerimeter - this.getSideBC().getLength()));
		
		return area;
	}
	
	@Override
	public String toString() {
		return String.format("Triangle[(%f,%f), (%f,%f)]", pointA.getX(), pointA.getY(), getHeight(), getHeight());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Triangle)){
			return false;
		}
		
		Triangle triangle = (Triangle) obj;
		
		if(triangle.hashCode() == this.hashCode()){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash  = 57;
		
		hash = hash + pointA.hashCode() + pointB.hashCode() + pointC.hashCode();
		
		return hash;
	}

	@Override
	public Point getCenter() {
		// TODO Auto-generated method stub
		return null;
	}
}
