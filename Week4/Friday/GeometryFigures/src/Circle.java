
public class Circle implements Shape{
	private final Point center;
	private final Double radius;
	
	public Circle(Point center , double radius){
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Circle circle){
		this(circle.center, circle.radius);
	}
	
	public Point getUpperLeft(){
		return new Point(center.getX() - radius, center.getY() + radius);
	}
	
	public Point getUpperRight(){
		return new Point(center.getX() + radius, center.getY() + radius);
	}
	
	public Point getLowerLeft(){
		return new Point(center.getX() - radius, center.getY() - radius);
	}
	
	public Point getLowerRight(){
		return new Point(center.getX() + radius, center.getY() - radius);
	}
	
	public Point getCenter(){
		return center;
	}
	
	public double getPerimeter(){
		return Math.PI*2.0*radius;
	}
	
	public double getArea(){
		return Math.PI*Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		return String.format("Circle[(%d,%d), (%f,%f)]", center.getX(), center.getY(), 2*radius, 2*radius);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle)){
			return false;
		}
		
		Circle circle = (Circle) obj;
		
		if(circle.hashCode() == this.hashCode()){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash  = 37;
		
		hash = hash + center.hashCode() + radius.intValue();
		
		return hash;
	}
}