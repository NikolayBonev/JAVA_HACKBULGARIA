import java.util.*;

public class FunnyArraySorter {
	private int pivot;
	
	public FunnyArraySorter(int pivot) {
		this.pivot = pivot;
	}
	
	public void reverseSort(List<Integer> list){
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
			
		});
	}
	
	public void pivotSubtractionSort(List<Integer> list){
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 - pivot > o2) ? 1 : ((o1 - pivot == o2) ? 0 : -1);
			}
			
		});
	}
	
	public void pivotDivisionSort(List<Integer> list){
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1/pivot > o2) ? 1 : ((o1/pivot == o2) ? 0 : -1);
			}
		});
	}
	
}
