package ParallelMinimalPointCalculations;

import java.util.List;
import java.util.Map;

public class CalculatorThread implements Runnable {
	private Map<Point, Point> result;
	private List<Point> points;
	private int start;
	private int end;

	public CalculatorThread(Map<Point, Point> result, List<Point> points, int start, int end) {
		super();
		this.result = result;
		this.points = points;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		Calculator.doCalculations(points, start, end, result);
	}

}
