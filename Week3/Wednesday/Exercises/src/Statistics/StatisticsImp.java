package Statistics;

import java.util.*;

public class StatisticsImp implements Statistics{
	private List<Integer> elements = new ArrayList<Integer>();
	private Map<Integer, Integer> count = new HashMap<Integer, Integer>();
	
	public void add(int element){
		elements.add(element);
		
		if(count.containsKey(element)){
			int counter = count.get(element);
			count.put(element, counter+1);
		}else{
			count.put(element, 1);
		}
		
		Collections.sort(elements);
	}
	
	@Override
	public double getMean() {
		double result = 0.0;
		
		for(int element : elements){
			result += element;
		}
		
		return result/elements.size();
	}

	@Override
	public double getMedian() {
		int count = elements.size();
		
		if(count != 0){
			if(count %2 == 0){
				return (elements.get((count/2) -1) + elements.get(count/2))/2;
			}else{
				return elements.get(count/2);
			}
		}
		
		return 0;
	}

	@Override
	public List<Integer> getMode() {
		List<Integer> result = new ArrayList<>();
		
		int swapNum = -1;
		int swapCount = -1;
		boolean flag = true;
		
		for(Map.Entry<Integer, Integer> entry: count.entrySet()){
			if(flag){
				swapNum = entry.getKey();
				swapCount = entry.getValue();
				
				result.add(swapNum);
				
				flag = false;
				
				continue;
			}
			
			if(entry.getValue() == swapCount){
				result.add(entry.getKey());
			}else if(entry.getValue() > swapCount){
				result.clear();
				
				result.add(entry.getKey());
			}
		}
		
		return result;
	}

	@Override
	public double getRange() {
		int countElements = elements.size();
		
		if(countElements != 0){
			return (elements.get(countElements -1) - elements.get(0));
		}
		
		return 0;
	}

}
