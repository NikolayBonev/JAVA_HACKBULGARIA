package ParallelMinimalPointCalculations;

import java.util.List;
import java.util.Map;

public class TestTask2 {

	public static void main(String[] args) {
		System.out.println("Generating points...");
		List<Point> points = Calculator.generatePoints();
		System.out.println("Points generated!");
		
		System.out.println("Finding nearest points...");
		Map<Point, Point> closestCatalog = Calculator.getNearestPoints(points);
		System.out.println("All points found!");
		
		System.out.println("Size of Map : " + closestCatalog.size());
	}

}