package ParallelMinimalPointCalculations;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(Point point){
		double distance = 0;
		distance += Math.pow(Math.abs(this.x - point.getX()), 2);
		distance += Math.pow(Math.abs(this.y - point.getY()), 2);
		
		return Math.sqrt(distance);
	}
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	
}
