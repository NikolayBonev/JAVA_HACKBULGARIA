
public class LineSegment implements Comparable<LineSegment>{

	private Point begining;
	private Point end;
	
	public LineSegment(Point begining, Point end){
		if(begining.getX() == end.getX() && begining.getY() == end.getY()){
			System.out.println("Cannot create a line segment with zero length");
			
			return;
		}
		
		this.begining = begining;
		this.end = end;
	}
	
	public LineSegment(LineSegment line){
		this(line.getBegining(), line.getEnd());
	}

	public Point getBegining() {
		return begining;
	}

	public Point getEnd() {
		return end;
	}
	
	public double getLength(){
		
		double xBegining = this.begining.getX();
		double xEnd = this.end.getX();
		
		double yBegining = this.begining.getY();
		double yEnd = this.end.getY();
		
		double len = Math.sqrt(Math.pow((xEnd-xBegining), 2) + Math.pow(yEnd - yBegining, 2));
		
		return len;
	}
	
	@Override
	public String toString() {
		return String.format("Line[(%d,%d), (%d,%d)]", this.begining.getX(), this.begining.getY(), this.end.getX(), this.end.getY());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof LineSegment)){
			return false;
		}
		
		LineSegment line = (LineSegment) obj;
		
		if(line.begining.equals(this.begining) && line.end.equals(this.end)){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
	    int hash = 17;
	    hash = hash * 23 + begining.hashCode();
	    hash = hash * 23 + end.hashCode();
	    return hash;
	}

	@Override
	public int compareTo(LineSegment line) {
		
		if(this.getLength() < line.getLength()){
			return -1;
		}else if(this.getLength() > line.getLength()){
			return 1;
		}
		
		return 0;
	}
}
